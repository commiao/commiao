package com.commiao.service.impl.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.commiao.dao.user.UserDao;
import com.commiao.domain.model.DataGrid;
import com.commiao.domain.pojo.user.User;
import com.commiao.service.user.UserService;
import com.framework.common.core.dao.DAO;
import com.framework.common.core.service.ServiceSupport;
/**
 * @author jingmiao
 *
 */
@Repository("userService")
public class UserServiceImpl extends ServiceSupport<User> implements UserService {
	@Autowired
    private UserDao userDao;

	@Override
	public DAO<User> getDao() {
		return userDao;
	}
	
	public DataGrid getDataGrid(User user){
		DataGrid dg = new DataGrid();
		dg.setTotal(userDao.COUNT(user));
		dg.setRows(userDao.GET_LIST(user));
		return dg;
	}

	/**
	 * 激活用户
	 */
	public void active(User user) {
		userDao.UPDATE(user);
	}

	/**
	 * 门户用户登录
	 */
	public User validationUser(String nickname, String password) {
		return userDao.GET("{nickname}{password}",nickname,password);
	}

	/**
	 * 身份证认证更新
	 */
	public void updateUserIdCard(User user) {
		userDao.UPDATE(user);
	}

	/**
	 * 用户手机认证更新
	 */
	public void updateUserMobile(User user) {
		userDao.UPDATE(user);
	}

	/**
	 * 用户更新绑定邮箱
	 */
	public void updateUserEmail(User user) {
		userDao.UPDATE(user);
	}

	/**
	 * 更新用户密码
	 */
	public void updatePassword(User user) {
		userDao.UPDATE(user);
	}

}
