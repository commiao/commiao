package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

public class CheckElecontractParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 1147634720125470536L;
	private String fundCode;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
}
