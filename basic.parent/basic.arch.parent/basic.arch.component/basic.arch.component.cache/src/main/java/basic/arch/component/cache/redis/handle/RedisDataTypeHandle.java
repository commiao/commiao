package basic.arch.component.cache.redis.handle;

import org.springframework.beans.factory.annotation.Autowired;

import basic.arch.component.cache.annotation.EnableCache;
import basic.arch.component.cache.redis.impl.RedisCacheService;

/**
 * CreateDate:2016年9月18日上午11:54:30
 * 
 * @Description: 数据类型处理
 * @author:jannal
 * @version V1.0
 */
public abstract class RedisDataTypeHandle {

    @Autowired
    protected RedisCacheService redisCacheService;

    /**
     * 是否超时
     * 
     * @param enableCache
     * @return
     */
    public boolean isTimeOut(EnableCache enableCache) {
        return enableCache.timeOut() > 0L;
    }

    public RedisCacheService getRedisCacheService() {
        return redisCacheService;
    }

    public void setRedisCacheService(RedisCacheService redisCacheService) {
        this.redisCacheService = redisCacheService;
    }

    public void doDelete(String finalKey) {
        redisCacheService.deleteByKeys(finalKey);
    }

    protected boolean isThrowException(EnableCache enableCache) {
        boolean flag = false;
        if (EnableCache.ExceptionStrategy.TRY_CATCH.equals(enableCache.exceptionStrategy())) {
            flag = true;
        } else if (EnableCache.ExceptionStrategy.THROW.equals(enableCache.exceptionStrategy())) {
            flag = false;
        }
        return flag;
    }

}
