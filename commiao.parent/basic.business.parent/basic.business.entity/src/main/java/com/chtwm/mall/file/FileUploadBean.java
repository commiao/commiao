package com.chtwm.mall.file;

import java.io.Serializable;

/** 
 * CreateDate:2017年1月7日下午3:57:58 
 * @Description: 文件上传使用bean  
 * @author:shl
 * @version V1.0   
 */
public class FileUploadBean implements Serializable {
	   /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -79678722588508749L;
	/**
     * 原始文件名
     */
    private String originalFile;
    /**
     * 新生成的文件名
     */
    private String newFileName;
    /**
     * 新生成的文件路径(文件访问路径)
     */
    private String fileAccessPath;
    
    /**
     * 文件实际存储路径
     */
    private String fileStoragePath;
    /**
     * 是否为空
     */
    private boolean isEmptyByte;
    /**
     * 文件大小
     */
    private long fileSize;
    /**
     * 是否合规则
     */
    private boolean isCompliance;
	public String getOriginalFile() {
		return originalFile;
	}
	public void setOriginalFile(String originalFile) {
		this.originalFile = originalFile;
	}
	public String getNewFileName() {
		return newFileName;
	}
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}
	public String getFileAccessPath() {
		return fileAccessPath;
	}
	public void setFileAccessPath(String fileAccessPath) {
		this.fileAccessPath = fileAccessPath;
	}
	public String getFileStoragePath() {
		return fileStoragePath;
	}
	public void setFileStoragePath(String fileStoragePath) {
		this.fileStoragePath = fileStoragePath;
	}
	public boolean isEmptyByte() {
		return isEmptyByte;
	}
	public void setEmptyByte(boolean isEmptyByte) {
		this.isEmptyByte = isEmptyByte;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public boolean isCompliance() {
		return isCompliance;
	}
	public void setCompliance(boolean isCompliance) {
		this.isCompliance = isCompliance;
	}
    
}
