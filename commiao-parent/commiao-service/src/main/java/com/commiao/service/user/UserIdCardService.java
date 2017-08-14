package com.commiao.service.user;

import com.commiao.domain.pojo.user.UserIdCard;
import com.framework.common.core.service.Service;


/**
 * @author hbl
 * 2016-2-29上午10:50:27
 * TODO
 */
public interface UserIdCardService extends Service<UserIdCard>{

	/**
	 * 保存用户身份证信息
	 * @param userIdCard
	 * @return 
	 */
	int save(UserIdCard userIdCard);
	
}
