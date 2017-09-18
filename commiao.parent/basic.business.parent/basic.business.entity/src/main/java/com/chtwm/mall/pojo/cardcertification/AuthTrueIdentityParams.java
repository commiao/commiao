package com.chtwm.mall.pojo.cardcertification;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月29日下午8:47:47 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class AuthTrueIdentityParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -318270495110042950L;
	/**
     * 真实姓名
     */
    private String custName;
    /**
     * 证件号码
     */
    private String custIdNo;
    /**
     * 证件类型
     */
    private String custIdType;
    /**
     * 发卡银行名称
     */
    private String bankName;
    /**
     * 发卡银行代码
     */
    private String bankIdNo;
    /**
     * 银行卡号
     */
    private String bankCardNo;
    /**
     * 手机号码
     */
    private String mobileNo;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 联行号
     */
    private String branchNo;
    /**
     * 流水号
     */
    private String serialNo;
    /**
     * 原流水号
     */
    private String originalSerialNo;
    /**
     * 验证码
     */
    private String smsCode;
    /**
     *客户端类型
     */
    private String clientType;
    /**
     * 图文验证码
     */
    private String imgCode;
    
	private String birthday;//出生日期 8位19900505
    
    private String vocation;//职业类型
     
    private String messageAddress;//通讯地址
     
    private String beneficiary;//实际受益人
    
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

    
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustIdNo() {
		return custIdNo;
	}
	public void setCustIdNo(String custIdNo) {
		this.custIdNo = custIdNo;
	}
	public String getCustIdType() {
		return custIdType;
	}
	public void setCustIdType(String custIdType) {
		this.custIdType = custIdType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIdNo() {
		return bankIdNo;
	}
	public void setBankIdNo(String bankIdNo) {
		this.bankIdNo = bankIdNo;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getOriginalSerialNo() {
		return originalSerialNo;
	}
	public void setOriginalSerialNo(String originalSerialNo) {
		this.originalSerialNo = originalSerialNo;
	}
	public String getSmsCode() {
		return smsCode;
	}
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
    
}
