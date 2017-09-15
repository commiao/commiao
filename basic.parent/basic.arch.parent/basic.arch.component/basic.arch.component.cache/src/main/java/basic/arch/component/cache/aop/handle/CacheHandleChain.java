package basic.arch.component.cache.aop.handle;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.aspectj.lang.ProceedingJoinPoint;

import basic.arch.component.cache.annotation.CacheType;
import basic.arch.component.cache.annotation.EnableCache;
/**
 * CreateDate:2016年9月18日上午10:54:16 
 * @Description: 处理链
 * @author:jannal
 * @version V1.0
 */
public class CacheHandleChain {

    private Map<CacheType, CacheAspectHandle> cacheHandlerMap = new ConcurrentHashMap<CacheType, CacheAspectHandle>();

    
    public Object handle(ProceedingJoinPoint pjp, EnableCache enableCache) throws Throwable {
        CacheAspectHandle cacheHandler = cacheHandlerMap.get(enableCache.cacheType());
        if (cacheHandler == null) {
            throw new RuntimeException("cacheHandler不存在,CacheHandleChain.cacheHandlerMap没有初始化");
        }
        switch (enableCache.cacheType()) {
        case REDIS:
           return cacheHandler.handle(pjp, enableCache);
        default:
            throw new RuntimeException("不支持的类型,目前仅仅支持,"+Arrays.toString(CacheType.values()));
        }
    }

    public Map<CacheType, CacheAspectHandle> getCacheHandlerMap() {
        return cacheHandlerMap;
    }


    public void setCacheHandlerMap(Map<CacheType, CacheAspectHandle> cacheHandlerMap) {
        this.cacheHandlerMap = cacheHandlerMap;
    }
    
}
