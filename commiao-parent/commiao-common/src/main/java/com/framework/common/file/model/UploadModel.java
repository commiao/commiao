package com.framework.common.file.model;

/**
 * @author jingmiao
 * 上传文件返回结果对象
 */
public class UploadModel {
	/**
	 * 上传是否成功
	 */
	private Boolean success;
	/**
	 * 文件名
	 */
	private String fileName;
	/**
	 * 文件存储路径
	 */
	private String fileFullPath;
	
	
	
	public UploadModel() { }

	public UploadModel(Boolean success, String fileName, String fileFullPath) {
		this.success = success;
		this.fileName = fileName;
		this.fileFullPath = fileFullPath;
	}
	
	/**
	 * 文件存储路径
	 * @return
	 */
	public Boolean getSuccess() {
		return success;
	}
	/**
	 * 文件存储路径
	 * @param success
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	/**
	 * 文件名
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * 文件名
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * 文件存储路径
	 * @return
	 */
	public String getFileFullPath() {
		return fileFullPath;
	}
	/**
	 * 文件存储路径
	 * @param fileFullPath
	 */
	public void setFileFullPath(String fileFullPath) {
		this.fileFullPath = fileFullPath;
	}
	
}
