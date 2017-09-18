package com.chtwm.mall.pojo.elecontractsignurl;

/*
 * 获取电子合同信息接口入参
 */
public class ElecontractSignUrlParam {
	private String fundCode;		//产品代码
	private String orderBalance;	//预约金额单位万元
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getOrderBalance() {
		return orderBalance;
	}
	public void setOrderBalance(String orderBalance) {
		this.orderBalance = orderBalance;
	}
	
	
	
}
