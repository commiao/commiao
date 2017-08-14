package com.commiao.dao;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.dao.user.UserMobileDao;
import com.commiao.domain.pojo.user.UserMobile;

/**
 * @author jingmiao
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:database_ctx.xml")
public class UserMobileDaoTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Autowired
	private UserMobileDao userMobileDao;
//	@Test
	public void testinsert() {
		UserMobile mobile = new UserMobile();
		mobile.setMobilePhone("18910923421");
		mobile.setActiveCode("1345");
		mobile.setMobileStatus(0);
		mobile.setUserId(Long.valueOf(4));
		mobile.setCreateTime(new Date());
		mobile.setCreateUserId(Long.valueOf(2));
		mobile.setCreateNickname("冯光明");
		userMobileDao.INSERT(mobile);
		System.out.println(mobile.getMobileId());

	}

//	@Test
	public void testupdate() {
		UserMobile mobile = new UserMobile();
		mobile.setMobileId(Long.valueOf(2));
		mobile.setMobilePhone("13519092341");
		mobile.setActiveCode("7890");
		mobile.setMobileStatus(1);
		mobile.setUserId(Long.valueOf(2));
		mobile.setUpdateTime(new Date());
		mobile.setUpdateUserId(Long.valueOf(1));
		mobile.setUpdateNickname("张维弘");
		userMobileDao.UPDATE(mobile);
		System.out.println(mobile.getMobileId());
	}

//	@Test
	public void testdelete() {
		UserMobile mobile = new UserMobile();
		mobile.setMobileId(Long.valueOf(1));
		userMobileDao.DELETE(mobile);
	}

//	@Test
	public void testfindUserMobileList() {
		UserMobile userMobile = new UserMobile();
		List<UserMobile> list = userMobileDao.GET_LIST(userMobile);
		if (list != null && list.size() > 0) {
			for (UserMobile userMobile2 : list) {
				System.out.println(userMobile2.getMobileId() + "\t"
						+ userMobile2.getMobilePhone() + "\t"
						+ userMobile2.getCreateNickname());

			}
		} else {
			System.out.println("没有查到相关信息!");
		}
	}

//	@Test
	public void testfindUserMobileById() {
		UserMobile mobile = userMobileDao.GET(Long.valueOf(3));
		if (mobile != null) {
			System.out.println(mobile.getMobileId() + "\t"
					+ mobile.getCreateNickname());
		} else {
			System.out.println("没有查到相关信!");
		}

	}

//	@Test
	public void testgetUserMobileCount() {
		UserMobile userMobile = new UserMobile();
		Long result = userMobileDao.COUNT(userMobile);
		System.out.println(result);
	}

}
