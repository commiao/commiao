package basic.arch.component.cache.redis.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisMqServiceImpl implements RedisMqService{

	@Autowired
    protected RedisTemplate<Serializable, Serializable> redisMqTemplate;
	
	@Override
	public <T> void save(T bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T read(T bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
