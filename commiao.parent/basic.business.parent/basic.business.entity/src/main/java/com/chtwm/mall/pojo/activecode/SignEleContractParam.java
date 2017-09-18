package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

import com.chtwm.mall.pojo.UserInfo;

/**
 * @brief 发送招商证券（电子合同身份验证）请求参数bean
 *
 * 发送招商证券（电子合同身份验证）请求参数bean
 * 
 * @author
 *    - 2016年8月4日  申贺龙  创建初始版本
 *
 */
public class SignEleContractParam implements Serializable {
	private static final long serialVersionUID = 8868900570385522746L;
/*	//证件类型
	private String creditType;
	//证件号
	private String creditNo;
	//投资人姓名
	private String customerName;*/
	//产品代码
	private String productNo;
	//交易流水号
	private String transactionNo;
	//是否已实名认证
	/*	private String isBankChecked;
	//投资人银行卡号
	private String accountNo;
	//银行代码
	private String bankCode;
	//投资人手机号
	private String mobileNo;*/
	//用户信息对象
	private UserInfo userInfo;
	//产品名称
	private String fundName;
	//客户端类型
	private String clientType;
	//赎回金额
	private String reserAamount;
	
	
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getTransactionNo() {
		return transactionNo;
	}
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	public String getReserAamount() {
		return reserAamount;
	}
	public void setReserAamount(String reserAamount) {
		this.reserAamount = reserAamount;
	}
}
