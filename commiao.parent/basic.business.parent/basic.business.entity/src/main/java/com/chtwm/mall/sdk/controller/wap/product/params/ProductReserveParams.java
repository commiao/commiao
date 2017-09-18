package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/**
 * 
 * CreateDate:2017年3月4日下午2:31:06 
 * @Description: 产品预约请求参数 
 * @author:shl
 * @version V1.0
 */
public class ProductReserveParams implements Serializable {

    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -4168417249032936326L;

	private String fundCode;
	
	private String appointMoney;
	
	private String brokerAccount;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getAppointMoney() {
		return appointMoney;
	}

	public void setAppointMoney(String appointMoney) {
		this.appointMoney = appointMoney;
	}

	public String getBrokerAccount() {
		return brokerAccount;
	}

	public void setBrokerAccount(String brokerAccount) {
		this.brokerAccount = brokerAccount;
	}
	 
}
