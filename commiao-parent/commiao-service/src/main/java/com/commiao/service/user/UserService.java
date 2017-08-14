package com.commiao.service.user;

import com.commiao.domain.model.DataGrid;
import com.commiao.domain.pojo.user.User;
import com.framework.common.core.service.Service;
/**
 * @author jingmiao
 *
 */
public interface UserService extends Service<User>{
    /**
     * 获取用户集合，返回以easyUI识别的DataGrid形式
     * @param user
     * @return 
     */
    public DataGrid getDataGrid(User user);
    
    /**
     * 激活新用户用户
     * @param user
     */
	public void active(User user);
	
	/**
	 * 门户用户登录
	 * @param nickname
	 * @param password
	 * @return
	 */
	public User validationUser(String nickname, String password);
	
	/**
	 * 用户认证身份证更新
	 * @param user
	 */
	public void updateUserIdCard(User user);
	
	/**
	 * 用户手机认证更新
	 * @param user
	 */
	public void updateUserMobile(User user);
	
	/**
	 * 用户更新绑定邮箱
	 * @param user
	 */
	public void updateUserEmail(User user);
	
	/**
	 * 更新用户密码
	 * @param user
	 */
	public void updatePassword(User user);

}
