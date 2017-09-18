package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月22日下午3:51:13 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryEleContractResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 9178636179407808514L;
	
	private String transactionNo;
	
	private String signUrl;
	
	private String signTip;

	public String getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getSignUrl() {
		return signUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

	public String getSignTip() {
		return signTip;
	}

	public void setSignTip(String signTip) {
		this.signTip = signTip;
	}
	
}
