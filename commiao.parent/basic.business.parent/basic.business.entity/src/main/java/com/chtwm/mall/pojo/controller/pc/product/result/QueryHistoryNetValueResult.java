package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月29日下午2:59:59 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryHistoryNetValueResult implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -1152634827419094271L;

	private String netValue;
	
	private String netValueDate;
	
	private String totalNetValue;
	
	private String fundName;
	
	private String netValueBeginDate;
	
	private String netValueEndDate;

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

	public String getTotalNetValue() {
		return totalNetValue;
	}

	public void setTotalNetValue(String totalNetValue) {
		this.totalNetValue = totalNetValue;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getNetValueBeginDate() {
		return netValueBeginDate;
	}

	public void setNetValueBeginDate(String netValueBeginDate) {
		this.netValueBeginDate = netValueBeginDate;
	}

	public String getNetValueEndDate() {
		return netValueEndDate;
	}

	public void setNetValueEndDate(String netValueEndDate) {
		this.netValueEndDate = netValueEndDate;
	}
	
}
