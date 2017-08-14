package com.framework.common.database;

/**
 * @author jingmiao
 * 插入数据库前组装参数
 */
public class InsertColumnModel {
	/**
	 * 字段名
	 */
	private String columnTitle;
	/**
	 * 值
	 */
	private Object value;
	/**
	 * 字段类型
	 */
	private String columnType;
	
	public InsertColumnModel(String columnTitle, String columnType) {
		this.columnTitle = columnTitle;
		this.columnType = columnType;
	}
	
	/**
	 * 字段名
	 * @return
	 */
	public String getColumnTitle() {
		return columnTitle;
	}
	/**
	 * 字段名
	 * @param columnTitle
	 */
	public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}
	/**
	 * 值
	 * @return
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * 值
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	/**
	 * 字段类型
	 * @return
	 */
	public String getColumnType() {
		return columnType;
	}
	/**
	 * 字段类型
	 * @param columnType
	 */
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	/**
	 * 值(int类型的值)
	 * @return
	 */
	public Integer getIntValue() {
		return Integer.valueOf(value.toString());
	}
	/**
	 * 值(int类型的值)
	 * @return
	 */
	public String getStrValue() {
		return value.toString();
	}
}
