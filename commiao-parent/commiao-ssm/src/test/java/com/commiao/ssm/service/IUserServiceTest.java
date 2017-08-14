package com.commiao.ssm.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.ssm.domain.User;
import com.framework.common.database.jdbc.JdbcHelper;

//@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class IUserServiceTest {
	private static Logger logger = Logger.getLogger(IUserServiceTest.class);
//	private ApplicationContext ac = null;
	@Autowired
//	private IUserService userService;

	@Before
	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
	}

//	@Test
	public void test() {
//		User user = userService.getUserById(1);
//		System.out.println(user.getUserName());
//		logger.info("值：" + user.getUserName());
	}
	
//	@Test
	public void testJdbc() throws Exception{
		String sql1 = " SELECT a.TARGET as isbol,COUNT(*) as total FROM a_model a GROUP BY a.TARGET ";
		String sql = " SELECT a.SEX_MARRY as groupname,a.TARGET as isbol,COUNT(*) as total FROM a_model a GROUP BY a.SEX_MARRY,a.TARGET ";
		List<Object> params = null;
		List<Map<String, Object>> list = JdbcHelper.getList(sql, params);
		for(Map<String, Object> map:list){
//			for (Map.Entry<String, Object> entry : map.entrySet()) {
//				System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//			}
			System.out.println("groupname = " + map.get("groupname"));
			System.out.println("isbol = " + map.get("isbol"));
			System.out.println("total = " + map.get("total"));
			System.out.println();
		}
	}
}
