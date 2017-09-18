package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月27日下午3:29:41 
 * @Description: 产品详情请求参数bean  
 * @author:shl
 * @version V1.0   
 */
public class QueryProductDetailParams implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -1086829414918995446L;
	
	private String productCode;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
