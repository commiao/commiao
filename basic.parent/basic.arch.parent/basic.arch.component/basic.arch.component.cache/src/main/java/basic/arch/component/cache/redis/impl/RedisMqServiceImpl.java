package basic.arch.component.cache.redis.impl;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

@Service("redisMqService")
public class RedisMqServiceImpl implements RedisMqService{
	
	private static final Logger logger = LoggerFactory.getLogger(RedisMqServiceImpl.class);

	@Autowired
    protected RedisTemplate<String, String> redisMqTemplate;
	
	/** 
	 * 从队列左侧插入一个对象. 
	 * @see basic.arch.component.cache.redis.impl.RedisMqService#pushFromLeft(java.lang.String, java.lang.Object) 
	 */  
	@Override
	public <V>void pushFromLeft(String key, V bean) {
		if(!(bean instanceof Serializable)){
			logger.error("向队列{}发送消息失败，消息为：{},原因为：{}", key, JSON.toJSON(bean),"bean对象必须实现序列化");
			return;
		}
		BoundListOperations<String, String> opsForList = redisMqTemplate.boundListOps(key);
		String valueString = JSONObject.toJSONString(bean);
		opsForList.leftPush(valueString);
	}

	/** 
	 * 从队列右侧移除一个对象. 
	 * @see basic.arch.component.cache.redis.impl.RedisMqService#removeFromRight(java.lang.String, java.lang.Class) 
	 */  
	@Override
	public <V> V removeFromRight(String key, Class<V> clazz) {
		V result = null;
		BoundListOperations<String, String> opsForList = redisMqTemplate.boundListOps(key);
		Object resultObject = opsForList.rightPop();
		if(resultObject!=null){
            String resultString = (String)resultObject;
            result = JSONObject.parseObject(resultString, clazz);
        }
		return result;
	}
	
	/** 
	 * 从队列右侧插入一个对象. 
	 * @see basic.arch.component.cache.redis.impl.RedisMqService#pushFromRight(java.lang.String, java.lang.Object) 
	 */  
	@Override
	public <V>void pushFromRight(String key, V bean) {
		if(!(bean instanceof Serializable)){
			logger.error("向队列{}发送消息失败，消息为：{},原因为：{}", key, JSON.toJSON(bean),"bean对象必须实现序列化");
			return;
		}
		BoundListOperations<String, String> opsForList = redisMqTemplate.boundListOps(key);
		String valueString = JSONObject.toJSONString(bean);
		opsForList.rightPush(valueString);
	}
	
	/** 
	 * 从队列左侧移除一个对象. 
	 * @see basic.arch.component.cache.redis.impl.RedisMqService#removeFromLeft(java.lang.String, java.lang.Class) 
	 */  
	@Override
	public <V> V removeFromLeft(String key, Class<V> clazz) {
		V result = null;
		BoundListOperations<String, String> opsForList = redisMqTemplate.boundListOps(key);
		Object resultObject = opsForList.leftPop();
		if(resultObject!=null){
			String resultString = (String)resultObject;
			result = JSONObject.parseObject(resultString, clazz);
		}
		return result;
	}

}
