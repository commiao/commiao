package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月30日下午5:33:12 
 * @Description: 赎回明细查询接收参数bean 
 * @author:shl
 * @version V1.0   
 */
public class QueryRedemptionDetailParams implements Serializable{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -1969919355587934465L;
	
	private String page_no;
	
	private String page_size;
	
	private String begin_date;
	
	private String end_date;

	public String getPage_no() {
		return page_no;
	}

	public void setPage_no(String page_no) {
		this.page_no = page_no;
	}

	public String getPage_size() {
		return page_size;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}

	public String getBegin_date() {
		return begin_date;
	}

	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
}
