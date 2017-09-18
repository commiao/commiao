package com.chtwm.mall.pojo.controller.pc.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午6:43:48 
 * @Description: 查询产品材料列表结果bean 
 * @author:shl
 * @version V1.0   
 */
public class QueryResourceResult implements Serializable {
	
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -5116536377469097559L;

	private String resName;
	
	private String createDate;
	
	private String fileUrl;
	
	private String filePathType;

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFilePathType() {
		return filePathType;
	}

	public void setFilePathType(String filePathType) {
		this.filePathType = filePathType;
	}
	
}
