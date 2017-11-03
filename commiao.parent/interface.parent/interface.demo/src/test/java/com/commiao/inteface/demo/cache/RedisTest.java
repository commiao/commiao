package com.commiao.inteface.demo.cache;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import basic.arch.component.cache.redis.impl.RedisCacheService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class RedisTest {
	@Autowired
	private RedisCacheService redisCacheService;
	
	String key = "pof:test:jingmiao";
	String value = "test成功";
	
	@Test
	public void testGet(){
		String result = redisCacheService.get(key, String.class, true);
		System.out.println("###################:"+result);
	}
	@Test
	public void testSave(){
		redisCacheService.saveOrUpdateTimeOut(key, value, 10l, TimeUnit.MINUTES);
	}
	@Test
	public void testDel(){
		redisCacheService.deleteByPrex(key);
	}
}
