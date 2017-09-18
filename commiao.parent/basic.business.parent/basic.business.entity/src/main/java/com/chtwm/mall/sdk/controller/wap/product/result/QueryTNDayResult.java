package com.chtwm.mall.sdk.controller.wap.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月16日下午2:55:55 
 * @Description: 查询T+N日响应bean 
 * @author:shl
 * @version V1.0   
 */
public class QueryTNDayResult implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 3253441379137064737L;
	
	
	private String tnDate;


	public String getTnDate() {
		return tnDate;
	}


	public void setTnDate(String tnDate) {
		this.tnDate = tnDate;
	}
	
}
