package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月27日下午3:32:10 
 * @Description: 产品详情响应结果 
 * @author:shl
 * @version V1.0   
 */
public class QueryProductDetailResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -4416762149601229108L;
	
	//产品名称
	private String productName;
	//项目名称
	private String projectName;
	//产品发行规模（单位：万）
	private String issueScale;
	//个人起投金额（单位：万）
	private String personMinBalance;
	//产品期限（单位：个月）
	private String prodTerm;
	//募集开始日期yyyy/MM/dd
	private String issueDate;
	//募集结束日期yyyy/MM/dd
	private String issueEndDate;
	//产品风险级别
	private String riskLevel;
	//产品风险级别(原值)
	private String riskLevelOri;
	//产品状态
	private String productStatus;
	//预约金额（单位：万）
	private String orderBalance;
	//预约编号
	private String orderNo;
	//预约状态
	private String orderStatus;
	//预约日期
	private String orderTime;
	//风险提示书id
	private String riskDisclosure;
	//管理机构
	private String managerName;
	//收益分配方式
	private String bonusType;
	//收益分配方式 （原值）
	private String bonusTypeOri;
	//递增金额
	private String reserveBaseBalance;
	//用户姓名（或登录手机号）
	private String userName;
	//客户类型（1.个人 0.机构）
	private String custType;
	//电子合同代码
	private String taFundCode;
	//是否需要判断投资者分类标签【1.否 2.是】
	private String isInvestClassifyRequired;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getIssueScale() {
		return issueScale;
	}
	public void setIssueScale(String issueScale) {
		this.issueScale = issueScale;
	}
	public String getPersonMinBalance() {
		return personMinBalance;
	}
	public void setPersonMinBalance(String personMinBalance) {
		this.personMinBalance = personMinBalance;
	}
	public String getProdTerm() {
		return prodTerm;
	}
	public void setProdTerm(String prodTerm) {
		this.prodTerm = prodTerm;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueEndDate() {
		return issueEndDate;
	}
	public void setIssueEndDate(String issueEndDate) {
		this.issueEndDate = issueEndDate;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevelOri() {
		return riskLevelOri;
	}
	public void setRiskLevelOri(String riskLevelOri) {
		this.riskLevelOri = riskLevelOri;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getOrderBalance() {
		return orderBalance;
	}
	public void setOrderBalance(String orderBalance) {
		this.orderBalance = orderBalance;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getRiskDisclosure() {
		return riskDisclosure;
	}
	public void setRiskDisclosure(String riskDisclosure) {
		this.riskDisclosure = riskDisclosure;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getBonusType() {
		return bonusType;
	}
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	public String getBonusTypeOri() {
		return bonusTypeOri;
	}
	public void setBonusTypeOri(String bonusTypeOri) {
		this.bonusTypeOri = bonusTypeOri;
	}
	public String getReserveBaseBalance() {
		return reserveBaseBalance;
	}
	public void setReserveBaseBalance(String reserveBaseBalance) {
		this.reserveBaseBalance = reserveBaseBalance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getTaFundCode() {
		return taFundCode;
	}
	public void setTaFundCode(String taFundCode) {
		this.taFundCode = taFundCode;
	}
    public String getIsInvestClassifyRequired() {
        return isInvestClassifyRequired;
    }
    public void setIsInvestClassifyRequired(String isInvestClassifyRequired) {
        this.isInvestClassifyRequired = isInvestClassifyRequired;
    }
	
}	
