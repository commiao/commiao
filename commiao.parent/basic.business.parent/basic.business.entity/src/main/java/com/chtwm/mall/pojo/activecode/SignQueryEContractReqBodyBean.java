package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月22日下午2:57:10 
 * @Description: 查询电子合同接口请求参数签名bean
 * @author:shl
 * @version V1.0   
 */
public class SignQueryEContractReqBodyBean implements Serializable{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -5820909215005056852L;
	
	private String transactionCode;
	
	private String transactionNo;
	
	private String companyId;
	
	private String customerName;
	
	private String creditType;
	
	private String creditNo;

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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

}
