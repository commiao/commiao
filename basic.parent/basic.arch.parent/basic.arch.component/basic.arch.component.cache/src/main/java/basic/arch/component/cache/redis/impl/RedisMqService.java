package basic.arch.component.cache.redis.impl;

public interface RedisMqService {
	
	<T>void save(T bean);
    <T>T read(T bean);
    
}
