/**
 * @file BankInfoQueryResponse.java
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
 * @brief 银行卡信息查询返回result
 *
 * 银行卡信息查询返回result
 * 
 * @author
 *    - 2016年6月21日  申贺龙  创建初始版本
 *
 */
public class BankInfoQueryResult implements Serializable {

	private static final long serialVersionUID = 2078135833233861722L;
	
	private String bank_account;//开户账号
	
	private String bank_name;//开户行名称
	
	private String bank_no;//开户行
	
	private String client_name;//开户行姓名
	
	private String is_main;//是否主卡
	
	private String mobile_tel;//手机号码
	
	private String record_date;//录入时间 【格式:yyyy-mm-dd hh24:mi:ss】

	public String getBank_account() {
		return bank_account;
	}

	public String getBank_name() {
		return bank_name;
	}

	public String getBank_no() {
		return bank_no;
	}

	public String getClient_name() {
		return client_name;
	}

	public String getIs_main() {
		return is_main;
	}

	public String getMobile_tel() {
		return mobile_tel;
	}

	public String getRecord_date() {
		return record_date;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public void setBank_no(String bank_no) {
		this.bank_no = bank_no;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public void setIs_main(String is_main) {
		this.is_main = is_main;
	}

	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}

	public void setRecord_date(String record_date) {
		this.record_date = record_date;
	}
	
}
