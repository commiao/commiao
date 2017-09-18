package com.chtwm.mall.pojo.pofCertification;


/** 
 * @Description: 校验是否实名认证-传入参数 
 * @author:wrx
 * @version V1.0   
 */
public class IdentityCertificationPofParam{

	/**
	 * idKindGb:证件类型. 
	 */
	private String idKindGb;
	/**
	 * idNo:身份证号. 
	 */
	private String idNo;
	/**
	 * accountName:真实姓名. 
	 */
	private String accountName;
	
	/**
	 * 获取 idKindGb:证件类型.
	 * @return the idKindGb
	 */
	public String getIdKindGb() {
		return idKindGb;
	}
	/**
	 * 设置 idKindGb:证件类型. 
	 * @param idKindGb the idKindGb to set
	 */
	public void setIdKindGb(String idKindGb) {
		this.idKindGb = idKindGb;
	}
	/**
	 * 获取 idNo:身份证号.
	 * @return the idNo
	 */
	public String getIdNo() {
		return idNo;
	}
	/**
	 * 设置 idNo:身份证号. 
	 * @param idNo the idNo to set
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	/**
	 * 获取 accountName:真实姓名.
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * 设置 accountName:真实姓名. 
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

}
