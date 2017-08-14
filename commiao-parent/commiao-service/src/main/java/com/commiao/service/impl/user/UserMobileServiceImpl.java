package com.commiao.service.impl.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserMobileDao;
import com.commiao.domain.pojo.user.UserMobile;
import com.commiao.service.user.UserMobileService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;

/**
 * @author hbl
 * 2016-2-29上午10:57:44
 * 用户身份证业务实现
 */
@Repository("userMobileService")
public class UserMobileServiceImpl extends ServiceSupport<UserMobile> implements UserMobileService {
	
	@Autowired
    private UserMobileDao userMobileDao;
	
	@Override
	public DAO<UserMobile> getDao() {
		return userMobileDao;
	}
	/**
	 * 保存用户手机信息
	 */
	public int save(UserMobile userMobile) {
		return userMobileDao.INSERT(userMobile);
	}

	/**
	 * 获取用户手机信息
	 */
	public UserMobile getById(Long mobileId) {
		return userMobileDao.GET(mobileId);
	}

	/**
	 * 用户手机激活
	 */
	public int active(UserMobile userMobile) {
		return userMobileDao.UPDATE(userMobile);
	}

	/**
	 * 手机用户激活
	 */
	public void activeMobileUser(UserMobile userMobile) {
		userMobileDao.UPDATE(userMobile);
	}

	/**
	 * 根据手机号查询
	 */
	@Override
	public UserMobile getByMobilPhone(String mobilePhone) {
		return userMobileDao.GET(mobilePhone);
	}

	/**
	 * 更新验证码
	 */
	@Override
	public void updateActiveCode(UserMobile userMobile) {
		userMobileDao.UPDATE(userMobile);
	}

	/**
	 *  根据验证码和手机号查询
	 */
	@Override
	public UserMobile getByPA(Map<String, Object> conds) {
		return userMobileDao.GET("userMobileMapper.getByPA",conds);
	}

}
