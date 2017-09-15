package basic.arch.component.cache.redis.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import basic.arch.component.cache.exception.CacheException;
import basic.arch.component.cache.redis.config.IKeyConfig;
import basic.arch.component.cache.redis.config.RedisKeyConfigImpl;
import basic.arch.component.cache.redis.contextholder.RedisSpringApplicationContextHolder;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
/**
 * redis实现类
 * @author jannal
 */
@SuppressWarnings("all")
@Service("redisCacheService")
public class RedisCacheServiceImpl implements RedisCacheService{
    
    @Autowired
    protected RedisTemplate<String, ?> redisStringTemplate;
    
    protected IKeyConfig redisKeyConfig;
    
    private Logger logger = LoggerFactory.getLogger(RedisCacheServiceImpl.class);
    
    public RedisCacheServiceImpl() {}
    
    public RedisCacheServiceImpl(IKeyConfig redisKeyConfig) {
        this.redisKeyConfig = redisKeyConfig;
    }

    @Override
    public void deleteByKeys(String... keys) throws CacheException {
        if(StringUtils.isEmpty(keys)||keys.length==0){
            throw new IllegalArgumentException("指定删除的key不能为空");
        }
        if(keys.length==1){
            if(StringUtils.isEmpty(keys[0])){
                throw new IllegalArgumentException("指定删除的key不能为空"); 
            }
            redisStringTemplate.delete(keys[0]); 
        }else{
            redisStringTemplate.delete(Arrays.asList(keys));      
        }
    }

    @Override
    public void deleteByPrex(String prex) throws CacheException {
        if(StringUtils.isEmpty(prex)){
            throw new IllegalArgumentException("指定删除的key前缀不能为空");
        }
        Set<String> keys=redisStringTemplate.keys(prex+"*");
        redisStringTemplate.delete(keys);
    }

    @Override
    public void deleteBySuffix(String suffix) throws CacheException  {
        if(StringUtils.isEmpty(suffix)){
            throw new IllegalArgumentException("指定删除的key后缀不能为空");
        }
        Set<String> keys=redisStringTemplate.keys("*"+suffix);
        redisStringTemplate.delete(keys);
    }
    @Override
    public Long incrNoTimeOut(String key,Long value) throws CacheException{
        Long executeResult = null;
        try {
            executeResult = (Long) redisStringTemplate.execute(incrSessionCallback(key, value, false, 0L, TimeUnit.SECONDS));
        } catch (Exception e) {
            throw new CacheException(key+"存入值发生错误,具体原因如下："+e.getMessage(),e);
        }
        return executeResult;
    }
    
    @Override
    public  Long incrTimeOut(String key, Long value, long liveTime, TimeUnit timeUnit) throws CacheException {
        validateTimeOut(liveTime, timeUnit);
        Long executeResult = null;
        try {
            executeResult = (Long) redisStringTemplate.execute(incrSessionCallback(getRedisKeyConfig().getTimeOutKey(key), value, true, liveTime, timeUnit));
        } catch (Exception e) {
            throw new CacheException(key+"存入值发生错误,具体原因如下："+e.getMessage(),e);
        }
        return executeResult;
    }

    @Override
    public <V> void saveOrUpdateTimeOut(String key, V value, long liveTime, TimeUnit timeUnit) throws CacheException {
        validateTimeOut(liveTime, timeUnit);
        try {
            String valueString = JSONObject.toJSONString(value);
            redisStringTemplate.execute(this.saveOrUpdateSessionCallback(getRedisKeyConfig().getTimeOutKey(key), valueString, true, liveTime, timeUnit));
        } catch (Exception e) {
            throw new CacheException(key+"存入值发生错误,具体原因如下："+e.getMessage(),e);
        }
    }

    @Override
    public <V> void saveOrUpdateNoTimeOut(String key, V value) throws CacheException {
        this.saveOrUpdate(key, value, false, 0L, TimeUnit.SECONDS);
    }
    @Override
    public  <V> V get(final String key,Class<V> clazz,boolean isTimeOutKey)  throws CacheException{
        V result = null;
        try {
            Object resultObject = redisStringTemplate.execute(this.getSessionCallback(getTimeOutKey(key, isTimeOutKey)));
            if(resultObject!=null){
                String resultString = (String)resultObject;
                result = JSONObject.parseObject(resultString, clazz);
            }
        } catch (Exception e) {
            throw new CacheException(key+"获取值发生错误,具体原因如下："+e.getMessage(),e);
        }
        return result;
    }
    
    /***
     * 通过key获取value 
     * @param <V>
     * @param key
     * @return
     */
    public  <V> List<V> getList( String key,Class<V> clazz,boolean isTimeOutKey)  throws CacheException{
        List<V> result = null;
        try {
            Object resultObject = redisStringTemplate.execute(this.getSessionCallback(getTimeOutKey(key, isTimeOutKey)));
            if(resultObject !=null ){
                String resultString = (String)resultObject;
                result = JSONArray.parseArray(resultString, clazz);
            }
        } catch (Exception e) {
            throw new CacheException(key+"获取值发生错误,具体原因如下："+e.getMessage(),e);
        }
        return result;
    }
    
    @Override
    public <V> Long rpush(String key, V value, long liveTime, boolean isSetTimeOut, TimeUnit timeUnit) throws CacheException {
      Long listLength = redisStringTemplate.execute(new SessionCallback<Long>(){
            @Override
            public Long execute(RedisOperations operations) throws DataAccessException {
                startTransaction(key, operations);
                BoundListOperations boundListOps = operations.boundListOps(key);
                String valueString = JSONObject.toJSONString(value);
                boundListOps.rightPush(valueString);
                if(isSetTimeOut){
                    boundListOps.expire(liveTime, timeUnit);
                }
                List execResult = commitTransaction(operations, key);//返回结构[链表长度,过期时间设置是否成功] eg:[100,true]
                Long curlistLength = null; 
                if(execResult.size()>0){
                    curlistLength = (Long) execResult.get(0);
                }
                return curlistLength;
            }});
      return listLength;
    } 
 /*   
    @Override
    public <V> void hashSetSaveOrUpdateNoTimeOut(String key, V value) throws CacheException {
        this.hashSaveOrUpdate(key, value, 0L,false, TimeUnit.SECONDS);
    }
    
    public <V> void hashSetSaveOrUpdateTimeOut(String key, V value, long liveTime, boolean isSetTimeOut,TimeUnit timeUnit) throws CacheException{
         validateTimeOut(liveTime, timeUnit);
         hashSaveOrUpdate(key, value, liveTime, isSetTimeOut, timeUnit);
    }

    private <V> void hashSaveOrUpdate(String key, V value, long liveTime, boolean isSetTimeOut, TimeUnit timeUnit) {
        this.redisStringTemplate.execute(new SessionCallback<V>() {
            @Override
            public Object execute(RedisOperations operations) throws DataAccessException {
                startTransaction(key, operations);
                BoundHashOperations boundHashOps = operations.boundHashOps(key);
                boundHashOps.put(key, value);
                if(isSetTimeOut){
                    boundHashOps.expire(liveTime, timeUnit);
                }
                List execResult = commitTransaction(operations, key);
               return execResult;
            }
        });
    }
    */
    
    
    
    

    private String getTimeOutKey(String key, boolean isTimeOutKey) {
        if(isTimeOutKey){
            key = getRedisKeyConfig().getTimeOutKey(key);
        }
        return key;
    }
    
    
    public void validateTimeOut(long liveTime,TimeUnit timeUnit){
        if(liveTime<=0){
            throw new IllegalArgumentException("超时时间liveTime必须指定并且大于0");
        }
        if(timeUnit==null){
            throw new IllegalArgumentException("timeUnit必须指定，不能为空");
        }
    }
    

    /**
     * @param key   键
     * @param value 值
     * @param isSetTimeOut 是否设置超时时间
     * @param liveTime  存活时间，如果isSetTimeOut设置为false
     * @param timeUnit  存活单位，如果isSetTimeOut设置为false
     */
    private <V>void saveOrUpdate(final String key, final V value,final boolean isSetTimeOut,final long liveTime,final TimeUnit timeUnit) throws CacheException {
        try {
           String valueString = JSONObject.toJSONString(value);
           redisStringTemplate.execute(this.saveOrUpdateSessionCallback(key, valueString, isSetTimeOut, liveTime, timeUnit));
        } catch (Exception e) {
            throw new CacheException(key+"存入值发生错误,具体原因如下："+e.getMessage(),e);
        }
    }
    
    
  
    private SessionCallback incrSessionCallback(final String key,final Long value,final boolean isSetTimeOut,final long liveTime,final TimeUnit timeUnit){
        return new SessionCallback<Long>() {
            @Override
            public Long execute(RedisOperations operations) throws DataAccessException {
                startTransaction(key, operations);
                BoundValueOperations vOper = operations.boundValueOps(key);
                Long increment = vOper.increment(value);
                if(isSetTimeOut){
                    vOper.expire(liveTime, timeUnit);
                }
                List execResult = commitTransaction(operations,key);
                Long afterIncValue = null;//自增之后的值
                if(execResult.size()>0){
                    afterIncValue  = (Long) execResult.get(0);
                }
                return afterIncValue;
            }
        };
    }
    
    
    /**
     * 获取，子类可以实现自己的回调  
     * @param key
     * @return
     */
    private SessionCallback getSessionCallback(final String key){
        return new SessionCallback() {
            @Override
            public Object execute(RedisOperations operations) throws DataAccessException {
                BoundValueOperations vOper = operations.boundValueOps(key);
                return vOper.get();
            }
        }; 

    }
    private SessionCallback saveOrUpdateSessionCallback(final String key, final String value,final boolean isSetTimeOut,final long liveTime,final TimeUnit timeUnit){
        return  new SessionCallback() {
            @Override
            @SuppressWarnings("all")
            public String  execute( RedisOperations operations) throws DataAccessException {
                startTransaction(key, operations);
                BoundValueOperations vOper = operations.boundValueOps(key);
                vOper.set(value);
                if(isSetTimeOut){
                    vOper.expire(liveTime, timeUnit);
                }
                List execResult = commitTransaction(operations,key);
                return value;
            }
        };
    }

    /**
     * 开启事务
     * @param key
     * @param operations
     */
    private void startTransaction(final String key,final  RedisOperations operations) {
        operations.watch(key);//监视key,，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断
        operations.multi();//标记事务的开始
    }
    /**
     * 提交事务
     * @param operations
     * @param key
     * @return
     */
    private List commitTransaction(final RedisOperations operations,final String key) {
        List execResult = operations.exec();// 提交事务
        //如果事务执行失败则返回nil，此时需要抛异常. 而空List表示没有返回，但是成功了
        if(execResult==null){ 
            logger.error("{}已经被改变，处理的事务被打断",key);
            throw new CacheException("[ " +key+" ]已经被改变，处理的事务被打断,没有成功");
        }else{
            logger.info("{}执行完之后的结果{}",key,execResult);
        }
        return execResult;
    }
    
    public RedisTemplate<String, ?> getRedisStringTemplate() {
        return redisStringTemplate;
    }

    public void setRedisStringTemplate(RedisTemplate<String, ?> redisStringTemplate) {
        this.redisStringTemplate = redisStringTemplate;
    }

    public IKeyConfig getRedisKeyConfig() {
        if(redisKeyConfig==null){
            RedisKeyConfigImpl redisKeyConfigImpl = RedisSpringApplicationContextHolder.getBean("redisKeyConfig",RedisKeyConfigImpl.class);
            if(redisKeyConfigImpl==null){
                throw new NoSuchBeanDefinitionException(RedisKeyConfigImpl.class, "RedisKeyConfigImpl没有初始化，请查看是否纳入spring管理");
            }
            redisKeyConfig = redisKeyConfigImpl;
         }
        return redisKeyConfig;
    }

    public void setRedisKeyConfig(IKeyConfig redisKeyConfig) {
        this.redisKeyConfig = redisKeyConfig;
    }

 


    

}
