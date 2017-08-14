package com.commiao.service.impl.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserEmailDao;
import com.commiao.domain.constants.Constants;
import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.commiao.service.user.UserEmailService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

@Repository("userEmailService")
public class UserEmailServiceImpl extends ServiceSupport<UserEmail> implements UserEmailService {
	
	@Autowired
    private UserEmailDao userEmailDao;
	@Override
	public DAO<UserEmail> getDao() {
		return userEmailDao;
	}
	
	/**
	 * 保存用户邮箱
	 */
	public int save(UserEmail mailAuthen,String registRand, User user) {
		mailAuthen.setEmail(user.getEmail());
		mailAuthen.setCreateTime(new Date());
		mailAuthen.setActiveCode(registRand);
		mailAuthen.setStatus(Constants.GLOBLE_YES);   //否（false，没有）10000000 或者 是（true，有）10000001
		mailAuthen.setEmailStatus(0);   //是否已激活（0：否，1：是）
		return userEmailDao.INSERT(mailAuthen);
	}


	/**
	 * 根据id获取用户邮件
	 */
	public UserEmail getUserEmailById(Long emailId) {
		return userEmailDao.GET(emailId);
	}


	/**
	 * 激活用户邮箱
	 */
	public void active(UserEmail userEmail) {
		userEmailDao.UPDATE(userEmail);
	}


	/**
	 * 更新用户id
	 */
	public void updateUserId(UserEmail mailAuthen) {
		userEmailDao.UPDATE(mailAuthen);
	}


	/**
	 * 手机注册的用户绑定邮箱时调用
	 */
	public int save(UserEmail userEmail) {
		return userEmailDao.INSERT(userEmail);
	}


	/**
	 * 邮箱是否存在
	 */
	public boolean isEmailExists(String email) {
		Long count = userEmailDao.COUNT("{email}",email);
		if(count >0){
			return true;
		}
		return false;
	}


	/**
	 * 根据eamil地址获取用户邮件
	 */
	public UserEmail getByEmail(String email) {
		return userEmailDao.GET("{email}",email);
	}

}
