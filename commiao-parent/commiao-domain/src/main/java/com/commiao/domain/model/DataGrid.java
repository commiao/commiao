package com.commiao.domain.model;

import java.util.List;

/**
 * easyui的datagrid模型
 * 
 * Author ningzhitao 
 * Date   15/12/19
 * 
 */
public class DataGrid implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Long total;// 总记录数
	private List rows;// 每行记录
	private List footer;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public List getFooter() {
		return footer;
	}

	public void setFooter(List footer) {
		this.footer = footer;
	}

}
