package basic.arch.component.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

import basic.arch.component.cache.exception.CacheException;
/**
 * 缓存业务操作接口
 * @author jannal
 */
public interface ICacheService {

    /**
     * 通过key删除
     * @param keys
     */
    public void deleteByKeys(String... keys) throws CacheException;
    /**
     * 通过前缀删除
     * @param prex
     */
    public void deleteByPrex(String prex) throws CacheException;
    /**
     * 通过后缀删除
     * @param suffix
     */
    public void deleteBySuffix(String suffix) throws CacheException;
    /**
     * 自增
     * @param key
     * @param value
     * @param liveTime
     * @param timeUnit
     * @return 返回自增之后的值
     */
    public Long incrTimeOut(String key,Long value,final long liveTime,final TimeUnit timeUnit) throws CacheException;
    
    /**
     * 自增不超时
     * @param key
     * @param value
     * @return
     * @throws CacheException
     */
    public Long incrNoTimeOut(String key,Long value) throws CacheException;
    
    /**
     * 保存或者更新
     * 温馨提示：数据的修改是直接失效缓存数据，再修改DB内容，但由于网络或者其他问题导致缓存数据没有清理，造成了脏数据。
     * @param key
     * @param value
     * @param liveTime 存活时间
     * @param timeUnit 存活时间单位
     * @throws CacheException
     */
    public <V> void saveOrUpdateTimeOut(final String key, final V value,final long liveTime,final TimeUnit timeUnit) throws CacheException;
    
    /**
     * 保存或更新不设置超时时间
     * @param key
     * @param value
     * @throws CacheException
     */
    public <V>  void saveOrUpdateNoTimeOut(final String key, final V value) throws CacheException;
    
    
    /**
     * @param key
     * @param clazz
     * @return
     * @throws CacheException
     */
    public  <V> V get( String key,Class<V> clazz,boolean isTimeOutKey)  throws CacheException;
    
    /**
     * 获取List
     * @param key
     * @param clazz
     * @return
     * @throws CacheException
     */
    public  <V> List<V> getList( String key,Class<V> clazz,boolean isTimeOutKey)  throws CacheException;
    
    
    
    
}
