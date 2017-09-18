package com.commiao.pojo.pof;

import java.io.Serializable;

/**
 * CreateDate:2016年10月13日下午5:26:28 
 * @Description: 用户信息Bean
 * @author:hehch
 * @version V1.0
 */
public class AcctCustBean implements Serializable {
	
	private static final long serialVersionUID = -5628060456928999963L;
	
	/**
	 * 用户编号
	 */
	private String custId;
	/**
	 * 用户姓名
	 */
	private String custName;
	/**
	 * 手机号码
	 */
	private String mobileNo;
	/**
	 * 邮箱
	 */
	private String eMail;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 身份证号
	 */
	private String idNo;
	/**
	 * 账户密码（非交易密码）
	 */
	private String acctPassword;
	/**
	 * 
	 */
	private String transCustId;
	/**
	 * 
	 */
	private String transPassWd;
	/**
	 * 账户状态
	 */
	private String custStatus;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 最后一次登录时间
	 */
	private String lastLoginTime;
	/**
	 * 风险等级
	 */
	private String riskRank;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 
	 */
	private String toextend;
	/**
	 * 创建者
	 */
	private String creator;
	/**
	 * 更新时间
	 */
	private String updateTime;
	/**
	 * 修改者
	 */
	private String updator;
	/**
	 * 投顾工号
	 */
	private String recomUserID;
	/**
	 * 恒生系统id
	 */
	private String hsId;
	/**
	 * 证件类型代码
	 */
	private String idnoType;
	
	public AcctCustBean() {
		super();
	}

	/** 
	 * 获取 用户编号 
	 * @return custId 
	 */
	public String getCustId() {
		return custId;
	}
	/** 
	 * 获取 用户姓名 
	 * @return custName 
	 */
	public String getCustName() {
		return custName;
	}
	/** 
	 * 获取 手机号码 
	 * @return mobileNo 
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/** 
	 * 获取 邮箱 
	 * @return eMail 
	 */
	public String geteMail() {
		return eMail;
	}
	/** 
	 * 获取 性别 
	 * @return sex 
	 */
	public String getSex() {
		return sex;
	}
	/** 
	 * 获取 身份证号 
	 * @return idNo 
	 */
	public String getIdNo() {
		return idNo;
	}
	/** 
	 * 获取 账户密码（非交易密码） 
	 * @return acctPassword 
	 */
	public String getAcctPassword() {
		return acctPassword;
	}
	/** 
	 * 获取  
	 * @return transCustId 
	 */
	public String getTransCustId() {
		return transCustId;
	}
	/** 
	 * 获取  
	 * @return transPassWd 
	 */
	public String getTransPassWd() {
		return transPassWd;
	}
	/** 
	 * 获取 账户状态 
	 * @return custStatus 
	 */
	public String getCustStatus() {
		return custStatus;
	}
	/** 
	 * 获取 创建时间 
	 * @return createTime 
	 */
	public String getCreateTime() {
		return createTime;
	}
	/** 
	 * 获取 最后一次登录时间 
	 * @return lastLoginTime 
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	/** 
	 * 获取 风险等级 
	 * @return riskRank 
	 */
	public String getRiskRank() {
		return riskRank;
	}
	/** 
	 * 获取 备注 
	 * @return remark 
	 */
	public String getRemark() {
		return remark;
	}
	/** 
	 * 获取  
	 * @return toextend 
	 */
	public String getToextend() {
		return toextend;
	}
	/** 
	 * 获取 创建者 
	 * @return creator 
	 */
	public String getCreator() {
		return creator;
	}
	/** 
	 * 获取 更新时间 
	 * @return updateTime 
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/** 
	 * 获取 修改者 
	 * @return updator 
	 */
	public String getUpdator() {
		return updator;
	}
	/** 
	 * 获取 投顾工号 
	 * @return recomUserID 
	 */
	public String getRecomUserID() {
		return recomUserID;
	}
	/** 
	 * 获取 恒生系统id 
	 * @return hsId 
	 */
	public String getHsId() {
		return hsId;
	}
	/** 
	 * 获取 证件类型代码 
	 * @return idnoType 
	 */
	public String getIdnoType() {
		return idnoType;
	}
	/**
	 * 设置 用户编号 
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * 设置 用户姓名 
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * 设置 手机号码 
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * 设置 邮箱 
	 * @param eMail the eMail to set
	 */
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	/**
	 * 设置 性别 
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 设置 身份证号 
	 * @param idNo the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	/**
	 * 设置 账户密码（非交易密码） 
	 * @param acctPassword the acctPassword to set
	 */
	public void setAcctPassword(String acctPassword) {
		this.acctPassword = acctPassword;
	}
	/**
	 * 设置  
	 * @param transCustId the transCustId to set
	 */
	public void setTransCustId(String transCustId) {
		this.transCustId = transCustId;
	}
	/**
	 * 设置  
	 * @param transPassWd the transPassWd to set
	 */
	public void setTransPassWd(String transPassWd) {
		this.transPassWd = transPassWd;
	}
	/**
	 * 设置 账户状态 
	 * @param custStatus the custStatus to set
	 */
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}
	/**
	 * 设置 创建时间 
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 设置 最后一次登录时间 
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * 设置 风险等级 
	 * @param riskRank the riskRank to set
	 */
	public void setRiskRank(String riskRank) {
		this.riskRank = riskRank;
	}
	/**
	 * 设置 备注 
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 设置  
	 * @param toextend the toextend to set
	 */
	public void setToextend(String toextend) {
		this.toextend = toextend;
	}
	/**
	 * 设置 创建者 
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 设置 更新时间 
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 设置 修改者 
	 * @param updator the updator to set
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	/**
	 * 设置 投顾工号 
	 * @param recomUserID the recomUserID to set
	 */
	public void setRecomUserID(String recomUserID) {
		this.recomUserID = recomUserID;
	}
	/**
	 * 设置 恒生系统id 
	 * @param hsId the hsId to set
	 */
	public void setHsId(String hsId) {
		this.hsId = hsId;
	}
	/**
	 * 设置 证件类型代码 
	 * @param idnoType the idnoType to set
	 */
	public void setIdnoType(String idnoType) {
		this.idnoType = idnoType;
	}
	
	
}
