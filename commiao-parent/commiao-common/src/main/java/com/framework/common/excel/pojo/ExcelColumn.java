package com.framework.common.excel.pojo;

import java.io.Serializable;

public class ExcelColumn implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 列名字(与数据库字段一致)
	 */
	private String title;
	/**
	 * 第几列(从0开始)
	 */
	private Integer sort;
	/**
	 * 项目主键
	 */
	private Integer project_id;
	
	public ExcelColumn() {}

	public ExcelColumn(Integer sort, String title) {
		this.sort = sort;
		this.title = title;
	}
	
	/**
	 * 主键
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 主键
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 第几列(从0开始)
	 * @return
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 第几列(从0开始)
	 * @param index
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 列名字(与数据库字段一致)
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 列名字(与数据库字段一致)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 项目主键
	 * @return
	 */
	public Integer getProject_id() {
		return project_id;
	}
	/**
	 * 项目主键
	 * @param project_id
	 */
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
}
