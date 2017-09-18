/**
 * @file UnionCertificationRequest.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年5月27日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年5月27日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.cardcertification;

import java.io.Serializable;

/**
 * @brief 银联实名认证请求参数
 *
 * 银联实名认证请求参数
 * 
 * @author
 *    - 2016年5月27日  申贺龙  创建初始版本
 *
 */
public class UnionCertificationRequestBean implements Serializable {

	private static final long serialVersionUID = 4384333476423116344L;
	
	//应用系统编号
	private String appSysId;
	//签名方法
	private String signMethod;
	//签名信息
	private String signature;
	//是否保存 true、false，默认为false
	//如果指定true，则客户号、电子邮箱、手机号必须保证一个不为空
	private String save;
	//借贷标志
	private String dcType;
	//卡号
	private String cardNo;
	//证件类型
	private String certType;
	//证件号
	private String certNo;
	//证件姓名
	private String usrName;
	//银行预留手机号[暂不校验预留手机号]
//	private String cardPhone;

	public String getAppSysId() {
		return appSysId;
	}

	public String getSignMethod() {
		return signMethod;
	}

	public String getSignature() {
		return signature;
	}

	public String getSave() {
		return save;
	}

	public String getDcType() {
		return dcType;
	}

	public String getCardNo() {
		return cardNo;
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

//	public String getCardPhone() {
//		return cardPhone;
//	}

	public void setAppSysId(String appSysId) {
		this.appSysId = appSysId;
	}

	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void setSave(String save) {
		this.save = save;
	}

	public void setDcType(String dcType) {
		this.dcType = dcType;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

//	public void setCardPhone(String cardPhone) {
//		this.cardPhone = cardPhone;
//	}
	
}
