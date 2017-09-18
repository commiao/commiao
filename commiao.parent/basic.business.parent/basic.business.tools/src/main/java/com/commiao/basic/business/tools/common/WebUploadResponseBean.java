/**
 * @file WebUploadResponseBean.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年6月8日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年6月8日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.commiao.basic.business.tools.common;

import java.io.Serializable;

/**
 * @brief 前端文件上传响应bean
 *
 * 前端文件上传响应bean
 * 
 * @author
 *    - 2016年6月8日  申贺龙  创建初始版本
 *
 */
public class WebUploadResponseBean implements Serializable {

	private static final long serialVersionUID = 7413031219585888448L;
	/**存储路径*/
	private String storagePath;
	/**文件名称*/
	private String fileName;
	/**文件绝对路径*/
	private String fileAbsoluteUrl;
	/**原文件名*/
	private String fileSourchName;

	public String getStoragePath() {
		return storagePath;
	}

	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}

	public String getFileName() {
		return fileName;
	}

	public String getFileAbsoluteUrl() {
		return fileAbsoluteUrl;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileAbsoluteUrl(String fileAbsoluteUrl) {
		this.fileAbsoluteUrl = fileAbsoluteUrl;
	}

	public String getFileSourchName() {
		return fileSourchName;
	}

	public void setFileSourchName(String fileSourchName) {
		this.fileSourchName = fileSourchName;
	}
	
}
