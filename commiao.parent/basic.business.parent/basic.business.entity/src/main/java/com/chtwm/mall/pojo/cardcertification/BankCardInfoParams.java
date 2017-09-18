/**
 * @file BankCardInfoParams.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年6月21日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年6月21日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.cardcertification;

import java.io.Serializable;

/**
 * @brief 类简要说明
 *
 * 类详细说明
 * 
 * @author
 *    - 2016年6月21日  申贺龙  创建初始版本
 *
 */
public class BankCardInfoParams implements Serializable {

	private static final long serialVersionUID = -4284970682648392507L;
	
	private String client_id;//客户编号
	
	private String bank_account;//银行账号
	
	private String client_name;//客户名称
	
	private String mobile_tel;//手机号

	public String getClient_id() {
		return client_id;
	}

	public String getBank_account() {
		return bank_account;
	}

	public String getClient_name() {
		return client_name;
	}

	public String getMobile_tel() {
		return mobile_tel;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}
	
}
