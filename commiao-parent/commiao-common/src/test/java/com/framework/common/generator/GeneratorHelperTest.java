package com.framework.common.generator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GeneratorHelperTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}
	
//	@Test
	public void testCreatFile(){
//		String[] str = {"user_main","user_email","user_head_pic"};
//		for(String s:str){
//			GeneratorHelper.createFile(s);
//		}
		GeneratorHelper.createFile("components_file_manager");
	}
}

