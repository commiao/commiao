package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午5:45:12 
 * @Description: 查询风险提示书请求bean
 * @author:shl
 * @version V1.0   
 */
public class QueryReminderParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -2449934390396450842L;

	private String productCode;
	
	private String riskDisclosureId;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRiskDisclosureId() {
		return riskDisclosureId;
	}

	public void setRiskDisclosureId(String riskDisclosureId) {
		this.riskDisclosureId = riskDisclosureId;
	}
}
