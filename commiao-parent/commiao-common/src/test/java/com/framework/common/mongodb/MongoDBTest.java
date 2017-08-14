package com.framework.common.mongodb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MongoDBTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	@Test
	public void test(){
		System.out.println("执行MongDBTest开始ing");
	}
}
