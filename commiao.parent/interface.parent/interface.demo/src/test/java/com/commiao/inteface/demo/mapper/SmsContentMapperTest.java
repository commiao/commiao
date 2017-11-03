package com.commiao.inteface.demo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class SmsContentMapperTest {
	
	@Autowired
	private SmsContentMapper smsContentMapper;
	
	@Test
	public void testGetSmsContentById() {
		System.out.println(smsContentMapper.getSmsContentById("9").toString());
	}

}
