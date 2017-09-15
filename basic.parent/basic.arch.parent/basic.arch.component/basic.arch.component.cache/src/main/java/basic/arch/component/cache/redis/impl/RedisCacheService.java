package basic.arch.component.cache.redis.impl;

import java.util.concurrent.TimeUnit;

import basic.arch.component.cache.ICacheService;
import basic.arch.component.cache.exception.CacheException;

public interface RedisCacheService extends ICacheService {

    /**
     * 返回列表的长度
     * 
     * @param key
     * @param value
     * @param liveTime
     * @param isSetTimeOut
     * @param timeUnit
     * @return
     * @throws CacheException
     */
    public <V> Long rpush(String key, V value, long liveTime, boolean isSetTimeOut, TimeUnit timeUnit) throws CacheException;

   /* public <V> void hashSetSaveOrUpdateTimeOut(String key, V value, long liveTime, boolean isSetTimeOut, TimeUnit timeUnit) throws CacheException;

    public <V> void hashSetSaveOrUpdateNoTimeOut(String key, V value) throws CacheException;*/

}
