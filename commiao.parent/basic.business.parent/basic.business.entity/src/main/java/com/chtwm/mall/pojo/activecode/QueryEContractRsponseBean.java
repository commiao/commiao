package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月22日下午2:25:15 
 * @Description: 查询电子合同EC0005接口响应bean 
 * @author:shl
 * @version V1.0   
 */
public class QueryEContractRsponseBean implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 3117455304671468470L;
	
	//响应码
	private String respcode;
	//响应信息
	private String respmsg;
	//交易流水号
	private String transactionNo;
	//跳转URL
	private String signUrl;
	//签名方法
	private String signMethod;
	//签名信息
	private String signature;
	//登录标识
	private String signTip;
	//查询成功标识
	private boolean queryFlag;

	public String getRespcode() {
		return respcode;
	}

	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}

	public String getRespmsg() {
		return respmsg;
	}

	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}

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

	public String getSignMethod() {
		return signMethod;
	}

	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignTip() {
		return signTip;
	}

	public void setSignTip(String signTip) {
		this.signTip = signTip;
	}

	public boolean isQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(boolean queryFlag) {
		this.queryFlag = queryFlag;
	}
	
	
}
