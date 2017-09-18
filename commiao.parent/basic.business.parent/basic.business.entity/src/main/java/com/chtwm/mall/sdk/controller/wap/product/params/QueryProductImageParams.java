package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月29日下午4:45:01 
 * @Description: 查询产品图片请求参数 
 * @author:shl
 * @version V1.0   
 */
public class QueryProductImageParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -7265394680558205915L;

	private String productCode;
	
	private String limitNum;

	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(String limitNum) {
		this.limitNum = limitNum;
	}
	
}
