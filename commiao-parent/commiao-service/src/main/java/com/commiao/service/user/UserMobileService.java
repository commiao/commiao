package com.commiao.service.user;

import java.util.Map;

import com.commiao.domain.pojo.user.UserMobile;
import com.framework.common.core.service.Service;


/**
 * @author hbl
 * 2016-2-29下午1:56:23
 * 用户手机业务接口
 */
public interface UserMobileService extends Service<UserMobile>{

	/**
	 * 保存用手机信息
	 * @param userIdCard
	 * @return 
	 */
	int save(UserMobile userMobile);

	/**
	 * 获取用户手机信息
	 * @param mobileId
	 * @return
	 */
	UserMobile getById(Long mobileId);

	/**
	 * 用户手机激活
	 * @param userMobile
	 */
	int active(UserMobile userMobile);

	/**
	 * 手机用户注册激活
	 * @param userMobile
	 */
	void activeMobileUser(UserMobile userMobile);

	/**
	 * 根据手机号查询
	 * @param mobile
	 * @return
	 */
	UserMobile getByMobilPhone(String mobilePhone);

	/**
	 * 更新验证码
	 * @param userMobile
	 */
	void updateActiveCode(UserMobile userMobile);

	/**
	 * 根据验证码和手机号查询
	 * @param conds
	 * @return
	 */
	UserMobile getByPA(Map<String, Object> conds);
	
}
