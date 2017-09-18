package com.chtwm.mall.sdk.controller.wap.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午2:27:48 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryProfitClassResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 7913536437297125459L;
	//上线金额（单位：万）
	private String amountMax;
	//下限金额（单位：万）
	private String amountMin;
	//收益率（百分比）
	private String profit;
	//受益级别
	private String profitClass;
	//受益级别名称
	private String profitClassName;
	//产品名称
	private String fundName;
	//项目名称
	private String projectName;
	//分红方式
	private String bonusType;

	public String getAmountMax() {
		return amountMax;
	}

	public void setAmountMax(String amountMax) {
		this.amountMax = amountMax;
	}

	public String getAmountMin() {
		return amountMin;
	}

	public void setAmountMin(String amountMin) {
		this.amountMin = amountMin;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBonusType() {
		return bonusType;
	}

	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}

	public String getProfitClass() {
		return profitClass;
	}

	public void setProfitClass(String profitClass) {
		this.profitClass = profitClass;
	}

	public String getProfitClassName() {
		return profitClassName;
	}

	public void setProfitClassName(String profitClassName) {
		this.profitClassName = profitClassName;
	}

}
