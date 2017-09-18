package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午6:39:35 
 * @Description: 查询产品材料列表请求bean  
 * @author:shl
 * @version V1.0   
 */
public class QueryResourceListParams implements Serializable {
	
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 8779959767446686118L;
	
	private String productCode;
	
	//附件类型
	private String fileType;
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
	
	
}
