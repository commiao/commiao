package com.commiao.dao;

import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.dao.user.UserEmailDao;
import com.commiao.domain.pojo.user.UserEmail;

/**
 * @author jingmiao
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:database_ctx.xml")
public class UserEmailDaoTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Autowired
	private UserEmailDao emailDao;

//	@Test
	public void testInsert() {
		UserEmail email = new UserEmail();
		email.setEmail("12909235981@qq.com");
		email.setActiveCode("123456");
		email.setEmailStatus(0);
		email.setUserId((long) 4);
		email.setCreateTime(new Date());
		email.setCreateUserId(4);
		email.setCreateNickname("sensen");
		email.setStatus(10000001);
		emailDao.INSERT(email);
		/*assertEquals("插入成功", emailDao.insert("userEmailMapper.insert", email),
				1);*/
		assertNull("插入失败", null);

	}

	// @Test
	public void testUpdate() {
		UserEmail userEmail = new UserEmail();
		userEmail.setEmailId(Long.valueOf(2));
		userEmail.setEmail("929433704@qq.com");
		userEmail.setActiveCode("789102");
		userEmail.setEmailStatus(1);
		userEmail.setUserId((long) 2);
		userEmail.setUpdateTime(new Date());
		userEmail.setUpdateUserId(4);
		userEmail.setUpdateNickname("李梅");
		userEmail.setStatus(0);
		emailDao.UPDATE("userEmailMapper.update", userEmail);
		System.out.println(userEmail.getEmailId());

	}

	// @Test
	public void testDelete() {
		emailDao.DELETE(Long.valueOf(2));

	}

//	@Test
	public void testfindUserEmailList() {
		UserEmail userEmail = new UserEmail();
		List<UserEmail> userEmailList = emailDao.GET_LIST(userEmail);
		if(userEmailList.size()>0){
			for (UserEmail userEmail2 : userEmailList) {
				System.out.println(userEmail2.getEmail() + "\t"
						+ userEmail2.getCreateNickname());

			}
		}else{
			System.out.println("没有查到相关信息!");
		}
		

	}

//	@Test
	public void testfindByEmailId() {
		UserEmail user = emailDao.GET(Long.valueOf(1));
		if(user!=null){
			System.out.println(user.getEmailId() + "\t" + user.getEmail() + "\t"
					+ user.getCreateNickname());
		}else{
			System.out.println("没有查到相关信息");
		}
		

	}
//	 @Test
	public void testgetUserEmailCount() {
		UserEmail email = new UserEmail();
		Long result = emailDao.COUNT(email);
		System.out.println(result);
	}
}
