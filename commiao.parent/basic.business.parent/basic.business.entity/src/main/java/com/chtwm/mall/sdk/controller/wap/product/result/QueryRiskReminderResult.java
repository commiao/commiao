package com.chtwm.mall.sdk.controller.wap.product.result;

import java.io.Serializable;

/** 
 * CreateDate:2016年12月28日下午5:58:07 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:shl
 * @version V1.0   
 */
public class QueryRiskReminderResult implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -7633278134605469831L;

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
