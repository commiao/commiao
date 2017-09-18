package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月29日下午12:48:31 
 * @Description: 查询产品历史净值  
 * @author:shl
 * @version V1.0   
 */
public class QueryHistoryNetValueParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 8997110745081902453L;

	private String pageNo;
	
	private String pageSize;
	
	private String productCode;
	
	private String days;
	
	private String netValueBeginDate;
	
	private String netValueEndDate;

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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
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
