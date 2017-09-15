package basic.arch.component.cache.handle;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.arch.component.cache.annotation.CacheType;
import basic.arch.component.cache.annotation.DataType;
import basic.arch.component.cache.annotation.EnableCache;
import basic.arch.component.cache.redis.handle.RedisStringDataTypeHandle;

/**
 * CreateDate:2016年9月14日下午5:10:48
 * @Description: redis缓存处理器
 * @author:jannal
 * @version V1.0
 */
@Service("redisCacheHandle")
public class RedisCacheHandle extends AbstactCacheHandle{
    @Autowired
    private RedisStringDataTypeHandle redisStringDataTypeHandle;
    
    private static final Logger logger = LoggerFactory.getLogger(RedisCacheHandle.class);

    @Override
    public Object handle(ProceedingJoinPoint pjp, EnableCache enableCache) throws Throwable {
        Object result = null;
        if (logger.isDebugEnabled()) {
            logger.debug("redis缓存处理开始.................");
        }
        Object[] argsValue = pjp.getArgs();// 具体的参数值
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();// 方法
        Class<?>[] argsClass = method.getParameterTypes();// 参数类型
        Class<? extends Object> targetClass = pjp.getTarget().getClass();// 目标类
        // 最终的key值
        String finalKey = getFinalKey(enableCache, argsValue, method, argsClass, targetClass);
        // 判断存入类型
        if (CacheType.REDIS.getDataType(DataType.STRING).equals(enableCache.dataType())) {
            if (EnableCache.KeyStrategy.QUERY.equals(enableCache.operationStrategy())) {
                return redisStringDataTypeHandle.doStringTypeQuery(pjp, finalKey, enableCache);
            } else if (EnableCache.KeyStrategy.DELETE.equals(enableCache.operationStrategy())) {
                redisStringDataTypeHandle.doStringTypeDelete(finalKey);
            } else if (EnableCache.KeyStrategy.SAVE_OR_UPDATE.equals(enableCache.operationStrategy())) {
                return redisStringDataTypeHandle.doStringTypeSaveOrUpdate(pjp, enableCache, method, finalKey);
            }
        }
        return result;
    }

    @Override
    public CacheType getCacheType() {
        return CacheType.REDIS;
    }

    /**
     * 获取key
     * @param enableCache
     * @param argsValue
     * @param method
     * @param argsClass
     * @param targetClass
     * @return
     * @throws NoSuchMethodException
     */
    public String getFinalKey(EnableCache enableCache, Object[] argsValue, Method method, Class<?>[] argsClass, Class<? extends Object> targetClass) throws Exception {
        String finalKey;
        if (argsClass != null && argsClass.length > 0) {
            finalKey = getKeyGenerationStrategy().generateKey(targetClass, enableCache.key(), argsValue, method, argsClass);
        } else {
            finalKey = enableCache.key();
        }
        return finalKey;
    }

}
