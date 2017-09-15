package basic.arch.component.cache.redis.handle;

import org.aspectj.lang.ProceedingJoinPoint;

import basic.arch.component.cache.annotation.EnableCache;

/**
 * CreateDate:2016年9月18日下午3:36:15 
 * @Description: hashset数据类型  
 * @author:jannal
 * @version V1.0
 */
public class RedisHashSetDataTypeHandle extends RedisDataTypeHandle{

    public Object doStringTypeQuery(ProceedingJoinPoint pjp, String finalKey, EnableCache enableCache) throws Throwable{
        return enableCache;
        
    }
}
