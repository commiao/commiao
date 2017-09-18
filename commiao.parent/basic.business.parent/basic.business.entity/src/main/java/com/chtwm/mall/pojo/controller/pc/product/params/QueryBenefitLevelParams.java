package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午2:14:21 
 * @Description: 查询收益级别参数bean  
 * @author:shl
 * @version V1.0   
 */
public class QueryBenefitLevelParams implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 5313811326570160168L;
	
	private String productCode;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
}
