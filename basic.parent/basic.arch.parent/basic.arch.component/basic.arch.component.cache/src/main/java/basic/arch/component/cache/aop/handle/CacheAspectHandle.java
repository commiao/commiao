package basic.arch.component.cache.aop.handle;

import org.aspectj.lang.ProceedingJoinPoint;

import basic.arch.component.cache.annotation.CacheType;
import basic.arch.component.cache.annotation.EnableCache;

public interface CacheAspectHandle {

    public  Object handle(ProceedingJoinPoint pjp, EnableCache enableCache) throws Throwable;
    
    public CacheType getCacheType();
    
}
