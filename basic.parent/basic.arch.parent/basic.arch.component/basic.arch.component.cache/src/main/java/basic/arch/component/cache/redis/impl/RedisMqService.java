package basic.arch.component.cache.redis.impl;

public interface RedisMqService {
	
	/** 
	 * @Description::(从队列左侧插入一个对象). <br/> 
	 * @author jingmiao
	 * @param key
	 * @param bean
	 */ 
	<V>void pushFromLeft(String key, V bean);
    /** 
     * @Description::(从队列右侧移除一个对象). <br/> 
     * @author jingmiao
     * @param key
     * @param clazz
     * @return
     */ 
    <V>V removeFromRight(String key, Class<V> clazz);
    /** 
     * @Description::(从队列右侧插入一个对象). <br/> 
     * @author jingmiao
     * @param key
     * @param bean
     */ 
    <V>void pushFromRight(String key, V bean);
	/** 
	 * @Description::(从队列左侧移除一个对象). <br/> 
	 * @author jingmiao
	 * @param key
	 * @param clazz
	 * @return
	 */ 
	<V>V removeFromLeft(String key, Class<V> clazz);
    
}
