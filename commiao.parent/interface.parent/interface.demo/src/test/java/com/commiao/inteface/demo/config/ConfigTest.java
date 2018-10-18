package com.commiao.inteface.demo.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import base.arch.tools.config.ConfigBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-all.xml")
public class ConfigTest {
	@Autowired
	private ConfigBean configBean;
	
	@Test
	public void start(){
		System.out.println("单元测试开始");
	}
	
	@Test
	public void test(){
		String str = configBean.getPofSmsConfig().getSmsSourceName();
		System.out.println("测试结果========================="+str);
	}
	
	@Test
	public void end(){
		System.out.println("单元测试结束");
	}
}
