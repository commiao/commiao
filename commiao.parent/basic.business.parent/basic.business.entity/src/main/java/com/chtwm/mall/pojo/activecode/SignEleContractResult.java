package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/** 
 * CreateDate:2016年10月14日下午2:52:27 
 * @Description: 
 * @author:shl
 * @version V1.0   
 */
public class SignEleContractResult implements Serializable{
	
	private static final long serialVersionUID = 1506226938231455380L;
	//交易流水号
	private String transactionNo;
	//跳转页面
	private String signUrl;
	//登录标识
	private String signTip;
	//10位激活码
	private String ecSpecifyCode;
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
	public String getEcSpecifyCode() {
		return ecSpecifyCode;
	}
	public void setEcSpecifyCode(String ecSpecifyCode) {
		this.ecSpecifyCode = ecSpecifyCode;
	}
	
}
