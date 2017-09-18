package com.chtwm.mall.pojo.supplyInfo.request;


/**
 * 用户信息完善请求bean
 * @author wrx
 *
 */
public class SupplyUserInfoRequest {
	private String birthday;//出生日期
	private String vocation;//职业类型
	private String messageAddress;//通讯地址
	private String beneficiary;//实际受益人
	private String regAddress;//注册地址(机构帐户)
	private String officeAddress;//办公地址(机构帐户)
	private String businessScope;//经营范围(机构帐户)
	private String orgHolding;//机构实际控制人(机构帐户)
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}
	public String getMessageAddress() {
		return messageAddress;
	}
	public void setMessageAddress(String messageAddress) {
		this.messageAddress = messageAddress;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
	public String getRegAddress() {
		return regAddress;
	}
	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getBusinessScope() {
		return businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getOrgHolding() {
		return orgHolding;
	}
	public void setOrgHolding(String orgHolding) {
		this.orgHolding = orgHolding;
	}
}
