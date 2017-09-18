package com.chtwm.mall.pojo.echoUser;

public class EchoUserInfo {
	private String maskName = "";// 用户名，未认证则显示加*手机号
	private String contactName="";//机构授权代理人姓名
	private String id_kind_gb = "";// 证件类型
	private String id_no = "";// 证件号
	private String birthday = "";// 出生日期
	private String vocation = "";// 职业类型
	private String vocationDesc="";//职业类型转译
	private String messageAddress = "";// 通讯地址
	private String beneficiary = "";// 实际受益人
	private String regAddress = "";// 注册地址(机构帐户)
	private String officeAddress = "";// 办公地址(机构帐户)
	private String businessScope = "";// 经营范围(机构帐户)
	private String orgHolding = "";// 机构实际控制人(机构帐户)
	private String id_kind_gb_desc="";//证件类型转译
	
	
	public String getVocationDesc() {
		return vocationDesc;
	}
	public void setVocationDesc(String vocationDesc) {
		this.vocationDesc = vocationDesc;
	}
    public String getId_kind_gb_desc() {
		return id_kind_gb_desc;
	}
	public void setId_kind_gb_desc(String id_kind_gb_desc) {
		this.id_kind_gb_desc = id_kind_gb_desc;
	}

	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getMaskName() {
		return maskName;
	}
	public void setMaskName(String maskName) {
		this.maskName = maskName;
	}
	public String getId_kind_gb() {
		return id_kind_gb;
	}
	public void setId_kind_gb(String id_kind_gb) {
		this.id_kind_gb = id_kind_gb;
	}
	public String getId_no() {
		return id_no;
	}
	public void setId_no(String id_no) {
		this.id_no = id_no;
	}
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
