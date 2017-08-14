package com.commiao.service.user;

import javax.servlet.http.HttpServletRequest;

import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;

public interface PortalUserService {

	/**
	 * 保存门户页面新注册用户
	 */
	public void saveNewUser(User user, UserEmail mailAuthen);

	/**注册新用户发送邮件
	 * @param registRand 
	 */
	public void sendEmail(User user, UserEmail mailAuthen,
			String registRand, HttpServletRequest request);

	
}
