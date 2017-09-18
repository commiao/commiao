package com.chtwm.mall.pojo.advisor;

import java.io.Serializable;

public class FinancialAdvisorResult implements Serializable {
	  private static final long serialVersionUID = 7863525321671900208L;
	  
	private String       broker_account  ;//           , //工号
	  private String       broker_name     ;//        ,//姓名
	  private String       career_status   ;//          ,//员工状态
	  private String       mobile_tel      ;//       ,//手机号码
	  private String       phone_tel       ;//      ,//座机
	  private String       address         ;//    ,//地址
	public String getBroker_account() {
		return broker_account;
	}
	public void setBroker_account(String broker_account) {
		this.broker_account = broker_account;
	}
	public String getBroker_name() {
		return broker_name;
	}
	public void setBroker_name(String broker_name) {
		this.broker_name = broker_name;
	}
	public String getCareer_status() {
		return career_status;
	}
	public void setCareer_status(String career_status) {
		this.career_status = career_status;
	}
	public String getMobile_tel() {
		return mobile_tel;
	}
	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}
	public String getPhone_tel() {
		return phone_tel;
	}
	public void setPhone_tel(String phone_tel) {
		this.phone_tel = phone_tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	  
	  
	  
}
