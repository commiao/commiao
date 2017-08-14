package com.framework.common.database.sql;

public class SqlColumnsModel {
	/**
	 * sql语句
	 */
	private String sql;
	/**
	 * 与sql参数顺序对应的列名字
	 */
	private String[] columns;
	
	public SqlColumnsModel(String sql, String[] columns) {
		this.sql = sql;
		this.columns = columns;
	}
	
	/**
	 * sql语句
	 * @return
	 */
	public String getSql() {
		return sql;
	}
	/**
	 * sql语句
	 * @param sql
	 */
	public void setSql(String sql) {
		this.sql = sql;
	}
	/**
	 * 与sql语句对应的参数
	 * @return
	 */
	public String[] getColumns() {
		return columns;
	}
	/**
	 * 与sql语句对应的参数
	 * @param columns
	 */
	public void setColumns(String[] columns) {
		this.columns = columns;
	}
	
}
