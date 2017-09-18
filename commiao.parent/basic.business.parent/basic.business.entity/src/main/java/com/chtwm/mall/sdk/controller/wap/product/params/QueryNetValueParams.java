package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午4:51:12 
 * @Description: 查询最新产品净值请求bean  
 * @author:shl
 * @version V1.0   
 */
public class QueryNetValueParams implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -957429048087787311L;
	private String productCode;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}	
