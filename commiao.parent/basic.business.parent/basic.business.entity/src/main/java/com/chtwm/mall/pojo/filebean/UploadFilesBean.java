/**
 * @file UploadFilesBean.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年6月4日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年6月4日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

/**
 * @brief 上传文件bean
 *
 * 上传文件bean
 * 
 * @author
 *    - 2016年6月4日  申贺龙  创建初始版本
 *
 */
public class UploadFilesBean implements Serializable {

	private static final long serialVersionUID = -1593314457347514835L;
	
	private String uploadFiles;
	
	private String suffix;

	public String getUploadFiles() {
		return uploadFiles;
	}

	public void setUploadFiles(String uploadFiles) {
		this.uploadFiles = uploadFiles;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
