package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

public class CustRegistForWapParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 8937897204786793227L;
	private String mobile_tel;//手机号
	private String code;//手机验证码
	private String imageCode;//图片验证码
	private String password;//密码    
	private String broker_account;//理财师工号
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile_tel() {
		return mobile_tel;
	}
	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBroker_account() {
		return broker_account;
	}
	public void setBroker_account(String broker_account) {
		this.broker_account = broker_account;
	}
}
