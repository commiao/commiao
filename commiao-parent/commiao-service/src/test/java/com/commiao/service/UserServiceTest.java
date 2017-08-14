package com.commiao.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.domain.constants.Constants;
import com.commiao.domain.constants.UserConstants;
import com.commiao.domain.pojo.user.User;
import com.commiao.service.user.UserService;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:spring-context.xml")
public class UserServiceTest {
	@Before
	public void setUp(){
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}
	@Autowired
	private UserService useruService;
//	@Test
	public void saveUserTest(){
		User user = new User();
		user.setNickname("wangwu");
		user.setPassword("333");
		user.setUserStatus(UserConstants.USER_STATUS_NEW);
		user.setStatus(Constants.GLOBLE_YES);
		useruService.save(user);
	}
//	@Test
	public void updateUserTest(){
		User user = new User();
		user.setUserId(21l);
		user.setNickname("wangwu222");
		user.setPassword("333");
		useruService.update(user);
	}
	
//	@Test
	public void validationUserTest(){
		String userName = "jingmiao";
		String password = "123456";
		User user = useruService.validationUser(userName, password);
		System.out.println(user.getUserId());
	}
	
//	@Test
	public void getByIdTest(){
		User user = useruService.getById(1l);
		System.out.println(user.getNickname());
	}
}
