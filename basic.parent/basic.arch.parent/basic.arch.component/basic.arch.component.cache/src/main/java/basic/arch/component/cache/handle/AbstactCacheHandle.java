package basic.arch.component.cache.handle;

import basic.arch.component.cache.annotation.EnableCache;
import basic.arch.component.cache.aop.handle.CacheAspectHandle;
import basic.arch.component.cache.redis.key.KeyGenerationStrategy;
import basic.arch.component.cache.redis.key.SpelKeyGenerationStrategy;
/**
 * CreateDate:2016年9月18日上午11:00:39 
 * @Description: 缓存处理抽象类  
 * @author:jannal
 * @version V1.0
 */
public abstract class AbstactCacheHandle implements CacheAspectHandle{

    /**
     * key的解析策略，默认使用spel表达式进行解析
     */
    protected KeyGenerationStrategy keyGenerationStrategy = new SpelKeyGenerationStrategy();
    
    /**
     * 是否超时
     * 
     * @param enableCache
     * @return
     */
    public boolean isTimeOut(EnableCache enableCache) {
        return enableCache.timeOut() > 0L;
    }
    
    
    public KeyGenerationStrategy getKeyGenerationStrategy() {
        return keyGenerationStrategy;
    }

    public void setKeyGenerationStrategy(KeyGenerationStrategy keyGenerationStrategy) {
        this.keyGenerationStrategy = keyGenerationStrategy;
    }
}
