package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月13日下午8:38:40 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryRedemptionParams implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 792732844526777825L;
	
	private String fundCode;
	
	private String totalShare;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getTotalShare() {
		return totalShare;
	}

	public void setTotalShare(String totalShare) {
		this.totalShare = totalShare;
	}
}
