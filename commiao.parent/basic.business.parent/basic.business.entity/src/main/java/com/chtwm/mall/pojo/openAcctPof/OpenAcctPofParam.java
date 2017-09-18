package com.chtwm.mall.pojo.openAcctPof;


/**
 * @Description: 公募开户请求参数
 * @author:wrx
 * @version V1.0
 */
public class OpenAcctPofParam {


	/**
	 * 真实姓名
	 */
	private String custName;
	/**
	 * 证件号码
	 */
	private String custIdNo;
	/**
	 * 证件类型
	 */
	private String custIdType;
	/**
	 * 发卡银行代码
	 */
	private String bankIdNo;
	/**
	 * 发卡银行名称
	 */
	private String bankName;
	/**
	 * 银行卡号
	 */
	private String bankCardNo;
	/**
	 * 鉴权方式
	 */
	private String capitalMode;
	/**
	 * 手机号码
	 */
	private String mobileNo;
	/**
	 * 协议号
	 */
	private String protocolNo;
	/**
	 * 联行号
	 */
	private String branchNo;
	/**
	 * 密码(已加密)
	 */
	private String password;
	/**
	 * 出生日期
	 */
	private String birthday; 
	/**
	 * 职业编码
	 */
	private String ofundProfCode;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 实际受益人
	 */
	private String beneficiary;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getOfundProfCode() {
		return ofundProfCode;
	}

	public void setOfundProfCode(String ofundProfCode) {
		this.ofundProfCode = ofundProfCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	/**
	 * 获取 真实姓名
	 * 
	 * @return custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * 获取 证件号码
	 * 
	 * @return custIdNo
	 */
	public String getCustIdNo() {
		return custIdNo;
	}

	/**
	 * 获取 证件类型
	 * 
	 * @return custIdType
	 */
	public String getCustIdType() {
		return custIdType;
	}

	/**
	 * 获取 发卡银行代码
	 * 
	 * @return bankIdNo
	 */
	public String getBankIdNo() {
		return bankIdNo;
	}

	/**
	 * 获取 发卡银行名称
	 * 
	 * @return bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 获取 银行卡号
	 * 
	 * @return bankCardNo
	 */
	public String getBankCardNo() {
		return bankCardNo;
	}

	/**
	 * 获取 鉴权方式
	 * 
	 * @return capitalMode
	 */
	public String getCapitalMode() {
		return capitalMode;
	}

	/**
	 * 获取 手机号码
	 * 
	 * @return mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * 获取 协议号
	 * 
	 * @return protocolNo
	 */
	public String getProtocolNo() {
		return protocolNo;
	}

	/**
	 * 获取 联行号
	 * 
	 * @return branchNo
	 */
	public String getBranchNo() {
		return branchNo;
	}

	/**
	 * 获取 密码(已加密)
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置 真实姓名
	 * 
	 * @param custName
	 *            the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * 设置 证件号码
	 * 
	 * @param custIdNo
	 *            the custIdNo to set
	 */
	public void setCustIdNo(String custIdNo) {
		this.custIdNo = custIdNo;
	}

	/**
	 * 设置 证件类型
	 * 
	 * @param custIdType
	 *            the custIdType to set
	 */
	public void setCustIdType(String custIdType) {
		this.custIdType = custIdType;
	}

	/**
	 * 设置 发卡银行代码
	 * 
	 * @param bankIdNo
	 *            the bankIdNo to set
	 */
	public void setBankIdNo(String bankIdNo) {
		this.bankIdNo = bankIdNo;
	}

	/**
	 * 设置 发卡银行名称
	 * 
	 * @param bankName
	 *            the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 设置 银行卡号
	 * 
	 * @param bankCardNo
	 *            the bankCardNo to set
	 */
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	/**
	 * 设置 鉴权方式
	 * 
	 * @param capitalMode
	 *            the capitalMode to set
	 */
	public void setCapitalMode(String capitalMode) {
		this.capitalMode = capitalMode;
	}

	/**
	 * 设置 手机号码
	 * 
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * 设置 协议号
	 * 
	 * @param protocolNo
	 *            the protocolNo to set
	 */
	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}

	/**
	 * 设置 联行号
	 * 
	 * @param branchNo
	 *            the branchNo to set
	 */
	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	/**
	 * 设置 密码(已加密)
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
