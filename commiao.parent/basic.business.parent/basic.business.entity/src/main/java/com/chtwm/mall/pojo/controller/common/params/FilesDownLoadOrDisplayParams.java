package com.chtwm.mall.pojo.controller.common.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年1月5日下午6:15:23 
 * @Description: 文件下载或在线展示请求参数bean 
 * @author:shl
 * @version V1.0   
 */
public class FilesDownLoadOrDisplayParams implements Serializable {

	/**
	 * serialVersionUID:序列化
	 */
	private static final long serialVersionUID = 6560582880712260988L;

	private String url;
	
	private String date;
	
	private String name;
	
	private String filePathType;
	/**是否下载 1.是 2.否*/
	private String isDownLoad;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilePathType() {
		return filePathType;
	}
	public void setFilePathType(String filePathType) {
		this.filePathType = filePathType;
	}
	public String getIsDownLoad() {
		return isDownLoad;
	}
	public void setIsDownLoad(String isDownLoad) {
		this.isDownLoad = isDownLoad;
	}
}
