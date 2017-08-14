package com.commiao.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.dao.user.UserDao;
import com.commiao.domain.constants.Constants;
import com.commiao.domain.constants.UserConstants;
import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.commiao.domain.pojo.user.UserHeadPic;
import com.commiao.domain.pojo.user.UserIdCard;
import com.commiao.domain.pojo.user.UserMobile;

/**
 * @author jingmiao
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations ="classpath:database_ctx.xml")
public class UserDaoTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Autowired
	private UserDao userDao;

//	@Test
	public void testinsert() {
		User user = new User();
		user.setUserId(Long.valueOf(10000000));
		user.setNickname("admin");
		user.setPassword("123456");
		user.setRealName("管理员");
		user.setUserStatus(UserConstants.USER_STATUS_NEW);
		user.setCreateTime(new Date());
		user.setCreateUserId(Long.valueOf(10000000));
		user.setCreateNickname("admin");
		userDao.INSERT(user);
		System.out.println(user.getUserId());
	}

//	@Test
	public void testUpdate() {
		User user = new User();
		UserHeadPic headPic = new UserHeadPic();
		headPic.setHeadPicId(Long.valueOf(1));
		UserIdCard idCard = new UserIdCard();
		idCard.setIdCardId(Long.valueOf(1));
		UserMobile mobile = new UserMobile();
		mobile.setMobileId(Long.valueOf(1));
		mobile.setMobilePhone("13519092341");
		UserEmail email = new UserEmail();
		email.setEmailId(Long.valueOf(1));
		email.setEmail("12909235981@qq.com");
		user.setUserId(Long.valueOf(9));
		user.setNickname("球球1");
		user.setPassword("1234");
		user.setIdCardId(Long.valueOf(1));
		user.setRealName("陈秋雨1");
		user.setCardNumber("123909234598120934");
		user.setUserStatus(0);
		user.setUpdateTime(new Date());
		user.setUpdateUserId(Long.valueOf(2));
		user.setUpdateNickname("婷婷");
		user.setStatus(0);
		user.setUserHeadPic(headPic);
		user.setUserIdCard(idCard);
		user.setUserMobile(mobile);
		user.setUserEmail(email);
		int result = userDao.UPDATE("userMapper.update", user);
		if (result > 0) {
			System.out.println("修改成功!");

		} else {
			System.out.println("修改失败!");

		}

	}
	
//	@Test
	public void testgetById(){
		User user=userDao.GET(Long.valueOf(10000001));
		if(user!=null) {
			System.out.println(user.getUserId()+"\t"+user.getCreateNickname()+"\t"+user.getEmail());
			
		}else {
			System.out.println("目前没有查到相关用户的信息！");
		}
	}
	
//	@Test
	public void testfindUsers() {
		User user = new User();
		user.setNickname("账户");
		List<User> list = userDao.GET_LIST(user);
		if(list!=null && list.size()>0){
			for (User user2 : list) {
				System.out.println(user2.getUserId() + "\t" + user2.getEmailId()
						+ "\t" + user2.getMobileId() + "\t"
						+ user2.getCreateNickname());

			}
		}else{
			System.out.println("没有查到相关信息!");
		}
		
	}

//	@Test
	public void testdelete() {
		User user = new User();
		user.setUserId(Long.valueOf(10000003));
		int result = userDao.DELETE(user);
		if (result > 0) {
			System.out.println("删除成功!");

		} else {
			System.out.println("删除失败!");
		}

	}
	
//	@Test
	public void testdeleteById() {

		int result = userDao.DELETE(Long.valueOf(10000000));
		if (result > 0) {
			System.out.println("删除成功!");

		} else {
			System.out.println("删除失败!");
		}

	}
	
//	@Test
	public void testgetUserCount(){
		User user=new User();
		user.setNickname("账户");
		Long count=userDao.COUNT(user);
		System.out.println(count);
	}
}
