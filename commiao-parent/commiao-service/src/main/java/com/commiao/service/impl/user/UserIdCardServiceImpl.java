package com.commiao.service.impl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserIdCardDao;
import com.commiao.domain.pojo.user.UserIdCard;
import com.commiao.service.user.UserIdCardService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

/**
 * @author hbl
 * 2016-2-29上午10:57:44
 * 用户身份证业务实现
 */
@Repository("userIdCardService")
public class UserIdCardServiceImpl extends ServiceSupport<UserIdCard> implements UserIdCardService {
	
	@Autowired
    private UserIdCardDao userIdCardEmailDao;
	@Override
	public DAO<UserIdCard> getDao() {
		return userIdCardEmailDao;
	}
	
	/**
	 * 保存用户身份证信息
	 */
	public int save(UserIdCard userIdCard) {
		return userIdCardEmailDao.INSERT(userIdCard);
	}
}
