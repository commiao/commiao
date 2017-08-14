package com.components.file.domain.pojo;

import com.framework.common.core.CommonConstants;
import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;

/**
 * 文件上传管理实体类
 * @author Administrator
 *
 */
public class FileManager extends EntitySupport implements Entity{
	private static final long serialVersionUID = -1L;
	
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 实际存储的名字
	 */
	private String fileRealname;
	/**
	 * 实际存储的路径
	 */
	private String filePath;
	/**
	 * 文件的标题
	 */
	private String fileTitle;
	/**
	 * 状态
	 */
	private Integer status=CommonConstants.GLOBLE_YES;
	
	/**
	 * 主键
	 * @return 主键
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 主键
	 * @param id 主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 文件名
	 * @return 文件名
	 */
	public String getFileRealname() {
		return fileRealname;
	}
	
	/**
	 * 文件名
	 * @param fileRealname 文件名
	 */
	public void setFileRealname(String fileRealname) {
		this.fileRealname = fileRealname;
	}
	
	/**
	 * 文件路径
	 * @return 文件路径
	 */
	public String getFilePath() {
		return filePath;
	}
	/**
	 * 文件路径 
	 * @param filePath 文件路径
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 *  文件标题
	 * @return  文件标题
	 */
	public String getFileTitle() {
		return fileTitle;
	}
	/**
	 *  文件标题
	 * @param fileTitle  文件标题
	 */
	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}

