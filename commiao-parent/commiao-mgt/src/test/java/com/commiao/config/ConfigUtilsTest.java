package com.commiao.config;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.configuration.ConfigUtils;

public class ConfigUtilsTest {
	@Before
	public void setUp(){
		System.out.println("before");
	}

	@After
	public void setDown(){
		System.out.println("after");
	}

	@Test
	public void test(){
		System.out.println(ConfigUtils.get("manage.aparam1"));
	}
}
