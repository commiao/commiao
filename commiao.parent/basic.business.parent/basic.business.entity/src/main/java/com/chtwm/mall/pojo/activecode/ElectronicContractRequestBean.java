/**
 * @file ElectronicContractRequestBean.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年8月4日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年8月4日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/**
 * @brief 发送招商证券（电子合同身份验证）请求参数bean
 *
 * 发送招商证券（电子合同身份验证）请求参数bean
 * 
 * @author
 *    - 2016年8月4日  申贺龙  创建初始版本
 *
 */
public class ElectronicContractRequestBean implements Serializable {

	private static final long serialVersionUID = 8444388246804179294L;
	//签名方法
	private String signMethod;
	//签名信息
	private String signature;
	//证件类型
	private String certType;
	//证件号
	private String certNo;
	//证件姓名
	private String usrName;
	//产品代码
	private String productNo;
	
	public String getSignMethod() {
		return signMethod;
	}
	public String getSignature() {
		return signature;
	}
	public String getCertType() {
		return certType;
	}
	public String getCertNo() {
		return certNo;
	}
	public String getUsrName() {
		return usrName;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
}
