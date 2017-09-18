package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2017年3月3日下午7:07:42 
 * @Description: 私募产品列表结果集 
 * @author:shl
 * @version V1.0   
 */
public class PefProductListResult implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 7331355732055521181L;
	//产品名称
	private String fundName;
	//产品代码
	private String fundCode;
	//项目代码
	private String projectCode;
	//项目名称
	private String projectName;
	//营销项目名称
	private String saleProjectName;
	//营销项目状态
	private String saleProStatus;
	//产品最新状态
	private String fundStatus;
	//发行日期
	private String issueDate;
	//发行结束日期
	private String issueEndDate;
	//发行规模
	private String issueScale;
	//管理人名称
	private String managerName;
	//产品供应商类型
	private String mandatorType;
	//个人起投金额
	private String personMinBalance;
	//产品期限
	private String prodTerm;
	//产品风险等级
	private String riskLevel;
	//产品风险等级原值
	private String riskLevelOri;
	//产品投向
	private String investDirection;
	//收益分配类型
	private String bonusType;
	//收益分配类型原值
	private String bonusTypeOri;
	//最低预期收益率 (百分比)
	private String expectedProfitMin;
	//最高预期收益率 (百分比)
	private String expectedProfitMax;
	//最新产品净值
	private String netValue;
	//最近产品净值日期
	private String netValueDate;
	
	
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
	public String getExpectedProfitMin() {
		return expectedProfitMin;
	}
	public void setExpectedProfitMin(String expectedProfitMin) {
		this.expectedProfitMin = expectedProfitMin;
	}
	public String getExpectedProfitMax() {
		return expectedProfitMax;
	}
	public void setExpectedProfitMax(String expectedProfitMax) {
		this.expectedProfitMax = expectedProfitMax;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getSaleProjectName() {
		return saleProjectName;
	}
	public void setSaleProjectName(String saleProjectName) {
		this.saleProjectName = saleProjectName;
	}
	public String getSaleProStatus() {
		return saleProStatus;
	}
	public void setSaleProStatus(String saleProStatus) {
		this.saleProStatus = saleProStatus;
	}
	public String getFundStatus() {
		return fundStatus;
	}
	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
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
	public String getIssueScale() {
		return issueScale;
	}
	public void setIssueScale(String issueScale) {
		this.issueScale = issueScale;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getMandatorType() {
		return mandatorType;
	}
	public void setMandatorType(String mandatorType) {
		this.mandatorType = mandatorType;
	}
	public String getPersonMinBalance() {
		return personMinBalance;
	}
	public void setPersonMinBalance(String personMinBalance) {
		this.personMinBalance = personMinBalance;
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
	public String getInvestDirection() {
		return investDirection;
	}
	public void setInvestDirection(String investDirection) {
		this.investDirection = investDirection;
	}
	public String getNetValue() {
		return netValue;
	}
	public void setNetValue(String netValue) {
		this.netValue = netValue;
	}
	public String getNetValueDate() {
		return netValueDate;
	}
	public void setNetValueDate(String netValueDate) {
		this.netValueDate = netValueDate;
	}
	public String getProdTerm() {
		return prodTerm;
	}
	public void setProdTerm(String prodTerm) {
		this.prodTerm = prodTerm;
	}
	
}
