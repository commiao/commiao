/**
 * @file ElectronicContractResponseBean.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年8月8日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年8月8日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/**
 * 
 * CreateDate:2016年10月14日上午10:56:44 
 * @Description: 签署电子合同接口响应bean
 * @author:shl
 * @version V1.0
 */
public class SignEContractResponseBean implements Serializable {

	private static final long serialVersionUID = -226384408815791977L;
	
	//响应代码
	private String respcode;
	//响应信息
	private String respmsg;
	//接口处理成功
	private boolean signFlag;
	//电子合同10位激活码
	private String ecSpecifyCode;
	//交易流水号
	private String transactionNo;
	//跳转页面URL
	private String signUrl;
	//签名标识
	private String signTip;
	
	private String signature;
	
	public String getRespcode() {
		return respcode;
	}
	public String getRespmsg() {
		return respmsg;
	}
	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}
	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}
	public boolean isSignFlag() {
		return signFlag;
	}
	public void setSignFlag(boolean signFlag) {
		this.signFlag = signFlag;
	}
	public String getEcSpecifyCode() {
		return ecSpecifyCode;
	}
	public void setEcSpecifyCode(String ecSpecifyCode) {
		this.ecSpecifyCode = ecSpecifyCode;
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
	public String getSignTip() {
		return signTip;
	}
	public void setSignTip(String signTip) {
		this.signTip = signTip;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
}
