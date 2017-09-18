package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月16日下午2:53:27 
 * @Description: 查询T+N日  请求bean
 * @author:shl
 * @version V1.0   
 */
public class QueryTNDayParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 3014762921294853324L;
	
	private String days;

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}
}
