package com.commiao.dao;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.dao.user.UserHeadPicDao;
import com.commiao.domain.constants.Constants;
import com.commiao.domain.pojo.user.UserHeadPic;

/**
 * @author jingmiao
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:database_ctx.xml")
public class UserHeadPicDaoTest {
	@Before
	public void setUp()throws Exception{
		System.out.println("before");
	}
	@Autowired
	private UserHeadPicDao userHeadPicDao;
//	@Test
	public void testinsert(){
		UserHeadPic headPic=new UserHeadPic();
		headPic.setTitle("卡哇伊");
		headPic.setFileId(Long.valueOf(1));
		headPic.setCreateTime(new Date());
		headPic.setCreateUserId(Long.valueOf(1));
		headPic.setCreatenNickName("霞之谷");
		userHeadPicDao.INSERT(headPic);
		System.out.println(headPic.getHeadPicId());
		
	}
//	@Test
	public void testupdate(){
		UserHeadPic headPic=new UserHeadPic();
		headPic.setHeadPicId(Long.valueOf(1));
		headPic.setTitle("卡哇伊1");
		headPic.setFileId(Long.valueOf(1));
		headPic.setStatus(Constants.GLOBLE_YES);
		userHeadPicDao.UPDATE(headPic);
		
	}
//	@Test
	public void testdelete(){
		int result=userHeadPicDao.DELETE(Long.valueOf(1));
		System.out.println(result);
	}
//	@Test
	public void testfindUserHeadPicList(){
		UserHeadPic headPic=new UserHeadPic();
		List<UserHeadPic> list=userHeadPicDao.GET_LIST(headPic);
		if(list!=null && list.size()>0){
			for (UserHeadPic headPicList : list) {
				System.out.println(headPicList.getTitle()+"\t"+headPicList.getHeadPicId());
				
			}
			
		}else{
			System.out.println("没有查到相关信息!");
		}
		
	}
//   @Test
	public  void testfindUserHeadPicById(){
		UserHeadPic headPic=userHeadPicDao.GET(Long.valueOf(1));
		if(headPic!=null){
			System.out.println(headPic.getHeadPicId()+"\t"+headPic.getTitle());
			
		}else{
			System.out.println("没有查到相关信息!");
		}
		
				
	}
//   @Test
   public void testfindUserHeadPicCount(){
	   UserHeadPic headPic=new UserHeadPic();
	   headPic.setHeadPicId(Long.valueOf(1));
	   Long result=userHeadPicDao.COUNT(headPic);
	   System.out.println(result);
   }

}
