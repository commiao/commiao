package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年3月3日下午5:01:57 
 * @Description: 私募产品列表请求参数 
 * @author:shl
 * @version V1.0   
 */
public class PefProductListParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 8361743992616202368L;
	//当前页号
	private String pageNo;
	//每页记录数
	private String pageSize;
	//产品名称
	private String fundName;
	//产品投向
	private String investDirection;
	//产品风险等级
	private String riskLevel;
	//收益类型
	private String bonusType;
	//投资期限(月) 最大值
	private String timeLimitMax;
	//投资期限(月) 最小值
	private String timeLimitMin;
	//投资起点(万) 最大值
	private String investStartMax;
	//投资起点(万) 最小值
	private String investStartMin;
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getInvestDirection() {
		return investDirection;
	}
	public void setInvestDirection(String investDirection) {
		this.investDirection = investDirection;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getBonusType() {
		return bonusType;
	}
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	public String getTimeLimitMax() {
		return timeLimitMax;
	}
	public void setTimeLimitMax(String timeLimitMax) {
		this.timeLimitMax = timeLimitMax;
	}
	public String getTimeLimitMin() {
		return timeLimitMin;
	}
	public void setTimeLimitMin(String timeLimitMin) {
		this.timeLimitMin = timeLimitMin;
	}
	public String getInvestStartMax() {
		return investStartMax;
	}
	public void setInvestStartMax(String investStartMax) {
		this.investStartMax = investStartMax;
	}
	public String getInvestStartMin() {
		return investStartMin;
	}
	public void setInvestStartMin(String investStartMin) {
		this.investStartMin = investStartMin;
	}

}
