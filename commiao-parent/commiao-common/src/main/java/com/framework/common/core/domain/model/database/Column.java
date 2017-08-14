package com.framework.common.core.domain.model.database;

/**
 * @author jingmiao
 *	字段
 */
public class Column {
	/**
	 * 字段名(数据库)
	 */
	private String columnTitle;
	/**
	 * 属性名(java)
	 */
	private String propertyName;
	/**
	 * 字段类型(数据库)
	 */
	private String columnType;
	/**
	 * 字段类型名称(数据库)
	 */
	private String columnTypeName;
	/**
	 * 属性类型(java)
	 */
	private String propertyType;
	/**
	 * 字段长度(数据库)
	 */
	private Integer columnLength;
	/**
	 * 是否是主键
	 */
	private Boolean isPrimaryKey;
	/**
	 * 是否是不能为空
	 */
	private Boolean isNotNull;
	
	/**
	 * @param columnTitle 字段名(数据库)
	 */
	public Column(String columnTitle) {
		this.columnTitle = columnTitle;
	}
	
	public Column() { }

	/**
	 * 字段名(数据库)
	 * @return
	 */
	public String getColumnTitle() {
		return columnTitle;
	}
	/**
	 * 字段名(数据库)
	 * @param columnTitle
	 */
	public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}
	/**
	 * 属性名(java)
	 * @return
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * 属性名(java)
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * 字段类型(数据库)
	 * @return
	 */
	public String getColumnType() {
		return columnType;
	}
	/**
	 * 字段类型(数据库)
	 * @param columnType
	 */
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	/**
	 * 字段类型名称(数据库)
	 * @return
	 */
	public String getColumnTypeName() {
		return columnTypeName;
	}
	/**
	 * 字段类型名称(数据库)
	 * @param columnTypeName
	 */
	public void setColumnTypeName(String columnTypeName) {
		this.columnTypeName = columnTypeName;
	}
	/**
	 * 属性类型(java)
	 * @return
	 */
	public String getPropertyType() {
		return propertyType;
	}
	/**
	 * 属性类型(java)
	 * @param propertyType
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	/**
	 * 字段长度(数据库)
	 * @return
	 */
	public Integer getColumnLength() {
		return columnLength;
	}
	/**
	 * 字段长度(数据库)
	 * @param coloumnLength
	 */
	public void setColumnLength(Integer columnLength) {
		this.columnLength = columnLength;
	}
	/**
	 * 是否是主键
	 * @return
	 */
	public Boolean getIsPrimaryKey() {
		return isPrimaryKey;
	}
	/**
	 * 是否是主键
	 * @param isPrimaryKey
	 */
	public void setIsPrimaryKey(Boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}
	/**
	 * 是否是不能为空
	 * @return
	 */
	public Boolean getIsNotNull() {
		return isNotNull;
	}
	/**
	 * 是否是不能为空
	 * @param isNotNull
	 */
	public void setIsNotNull(Boolean isNotNull) {
		this.isNotNull = isNotNull;
	}

}
