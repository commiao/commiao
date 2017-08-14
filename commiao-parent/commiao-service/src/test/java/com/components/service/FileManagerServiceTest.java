package com.components.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.domain.constants.Constants;
import com.components.domain.pojo.file.FileManager;
import com.components.service.file.FileManagerService;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:spring-context.xml")
public class FileManagerServiceTest {
	@Before
	public void setUp(){
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}
	@Autowired
	private FileManagerService fileManagerService;
//	@Test
	public void saveUserTest(){
		FileManager fileManager = new FileManager();
		fileManager.setFileTitle("save-test");
		fileManager.setFileRealname("001.jsp");
		fileManager.setFilePath("/upoad/001.jsp");
		fileManagerService.save(fileManager);
	}
//	@Test
	public void getByIdTest(){
		FileManager fileManager = fileManagerService.getById(1l);
		System.out.println(fileManager.getFileTitle());
	}
//	@Test
	public void updateUserTest(){
		FileManager fileManager = fileManagerService.getById(1l);
		fileManager.setFileTitle("update-test");
		fileManagerService.update(fileManager);
		System.out.println(fileManager.getFileTitle());
	}
}
