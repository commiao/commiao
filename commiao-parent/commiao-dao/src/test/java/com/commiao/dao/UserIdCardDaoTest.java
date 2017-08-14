package com.commiao.dao;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.dao.user.UserIdCardDao;
import com.commiao.domain.constants.Constants;
import com.commiao.domain.pojo.user.UserIdCard;

/**
 * @author jingmiao
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:database_ctx.xml")
public class UserIdCardDaoTest {
	@Before
	public void setUp()throws Exception{
		System.out.println("before");
	}
	@Autowired
	private UserIdCardDao idCardDao;
//	@Test
	public void testinsert(){
		UserIdCard idCard=new UserIdCard();
		idCard.setRealName("张宝丽");
		idCard.setCardNumber("130426199502139823");
		idCard.setIdCardStatus(0);
		idCard.setFileId(Long.valueOf(1));
		idCard.setUserId(Long.valueOf(2));
		idCard.setCreateTime(new Date());
		idCard.setCreateUserId(Long.valueOf(1));
		idCard.setCreateNickname("豆豆");
		idCardDao.INSERT(idCard);
		System.out.println(idCard.getIdCardId());
		
	}
//	@Test
	public void testupdate(){
		UserIdCard idCard=new UserIdCard();
		idCard.setIdCardId(Long.valueOf(1));
		idCard.setRealName("张鑫");
		idCard.setCardNumber("13442698802139823");
		idCard.setIdCardStatus(0);
		idCard.setFileId(Long.valueOf(2));
		idCard.setUserId(Long.valueOf(1));
		idCard.setUpdateTime(new Date());
		idCard.setUpdateUserId(Long.valueOf(1));
		idCard.setUpdateNickname("sensen");
		idCard.setStatus(Constants.GLOBLE_YES);
		idCardDao.UPDATE("userIdCardMapper.update", idCard);
		System.out.println(idCard.getIdCardId());
	}
//	@Test
	public void testdelete(){
		int result=idCardDao.DELETE(Long.valueOf(1));
		if(result>0){
			System.out.println("删除成功!");
			
		}
		else{
			System.out.println("删除失败!");
		}
	}
//	@Test
	public void testfindUserIdCardList(){
		UserIdCard  userIdCard=new UserIdCard();
		List<UserIdCard> list=idCardDao.GET_LIST(userIdCard);
		if(list!=null &&list.size()>0){
			for (UserIdCard userIdCard2 : list) {
				System.out.println(userIdCard2.getIdCardId()+"\t"+userIdCard2.getRealName()+"\t"+userIdCard2.getCardNumber());
				
			}
		}else{
			System.out.println("没有查到相关信息!");
		}
	}
//	@Test
	public void testfindUserIdCardById(){ 
		UserIdCard idCard=idCardDao.GET(Long.valueOf(1));
		if(idCard!=null){
			System.out.println(idCard.getIdCardId()+"\t"+idCard.getCardNumber()+"\t"+idCard.getRealName());
		}else{
			System.out.println("没有查到相关信息!");
		}
		
	}
//	@Test
	public void testfindUserIdCardCount(){
		UserIdCard userIdCard=new UserIdCard();
		userIdCard.setIdCardId(Long.valueOf(2));
		Long result=idCardDao.COUNT(userIdCard);
		System.out.println(result);
	}

}
