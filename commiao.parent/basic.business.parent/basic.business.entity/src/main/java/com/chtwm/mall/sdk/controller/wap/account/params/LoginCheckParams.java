package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年3月2日下午5:52:22 
 * @Description: 用户登录请求参数 
 * @author:shl
 * @version V1.0   
 */
public class LoginCheckParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -7019811063798062973L;
	private String loginPhone;//登录手机号
	private String password;//登录密码
	private String custType;//客户类型
	public String getLoginPhone() {
		return loginPhone;
	}
	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
}
