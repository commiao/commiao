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
public class SignEContractReqBodyBean implements Serializable {
	private static final long serialVersionUID = -8500545873071631669L;
	//证件类型
	private String creditType;
	//证件号
	private String creditNo;
	//投资人姓名
	private String customerName;
	//产品代码
	private String productNo;
	//交易码
	private String transactionCode;
	//交易流水号
	private String transactionNo;
	//渠道编号
	private String companyId;
	//是否已实名认证
	private String isBankChecked;
	//投资人银行卡号
	private String accountNo;
	//投资金额
	private String reserAamount;
	//风险级别
	private String riskLevel;
	//合格投资者级别
	private String aptitudeType;
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getCreditType() {
		return creditType;
	}
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getTransactionNo() {
		return transactionNo;
	}
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getIsBankChecked() {
		return isBankChecked;
	}
	public void setIsBankChecked(String isBankChecked) {
		this.isBankChecked = isBankChecked;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
//	public String getBankCode() {
//		return bankCode;
//	}
//	public void setBankCode(String bankCode) {
//		this.bankCode = bankCode;
//	}
//	public String getMobileNo() {
//		return mobileNo;
//	}
//	public void setMobileNo(String mobileNo) {
//		this.mobileNo = mobileNo;
//	}
	public String getReserAamount() {
		return reserAamount;
	}
	public void setReserAamount(String reserAamount) {
		this.reserAamount = reserAamount;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getAptitudeType() {
		return aptitudeType;
	}
	public void setAptitudeType(String aptitudeType) {
		this.aptitudeType = aptitudeType;
	}
	
}
