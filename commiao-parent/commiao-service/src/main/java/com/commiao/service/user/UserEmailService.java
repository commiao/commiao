package com.commiao.service.user;

import com.commiao.domain.pojo.user.User;
import com.commiao.domain.pojo.user.UserEmail;
import com.framework.common.core.service.Service;


/**
 * @author hbl
 * 2016-2-25下午3:04:21
 * 用户邮件接口
 */
public interface UserEmailService extends Service<UserEmail>{
	
	/**
	 *添加新用户注册时的用户邮箱
	 * @param mailAuthen 
	 */
	public int save(UserEmail mailAuthen, String registRand, User user);

	/**
	 * 根据id获取用户邮件
	 * @param emailId
	 * @return
	 */
	public UserEmail getUserEmailById(Long emailId);

	/**
	 * 激活用户邮箱
	 * @param userEmail
	 */
	public void active(UserEmail userEmail);

	/**
	 * 更新用户id
	 * @param mailAuthen
	 */
	public void updateUserId(UserEmail mailAuthen);

	
	/**
	 * 手机注册的用户绑定邮箱时调用
	 * @param userEmail
	 */
	public int save(UserEmail userEmail);

	/**
	 * 邮箱是否存在
	 * @param email
	 * @return
	 */
	public boolean isEmailExists(String email);

	/**
	 * 根据email获取UserEmail
	 * @param email
	 * @return
	 */
	public UserEmail getByEmail(String email);

}
