package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月10日下午3:43:51 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class AddRedemptionParams implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 6478198215308719014L;
	
	private String fundCode;
	
	private String isAllRedemption;//全额赎回标识0-否(默认)1-全额赎回
	
	private String shares;
	
	private String smsCode;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getIsAllRedemption() {
		return isAllRedemption;
	}

	public void setIsAllRedemption(String isAllRedemption) {
		this.isAllRedemption = isAllRedemption;
	}

	public String getShares() {
		return shares;
	}

	public void setShares(String shares) {
		this.shares = shares;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	
}
