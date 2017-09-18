package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午4:54:41 
 * @Description: 查询最新产品净值响应bean
 * @author:shl
 * @version V1.0   
 */
public class QueryNetValueResult implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -1111219462694491746L;

	private String netValue;
	
	private String netValDate;
	
	private String totalNetValue;

	public String getNetValue() {
		return netValue;
	}

	public void setNetValue(String netValue) {
		this.netValue = netValue;
	}

	public String getNetValDate() {
		return netValDate;
	}

	public void setNetValDate(String netValDate) {
		this.netValDate = netValDate;
	}

	public String getTotalNetValue() {
		return totalNetValue;
	}

	public void setTotalNetValue(String totalNetValue) {
		this.totalNetValue = totalNetValue;
	}
}
