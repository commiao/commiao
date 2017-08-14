package com.framework.common.core.domain.model.database;

public class PrimaryKey {
	/**
	 * 主键字段名(数据库)
	 */
	private String keyTitle;
	/**
	 * 主键属性名(java)
	 */
	private String propertyName;
	/**
	 * 多列主键中列的序列号(数据库)
	 */
	private Short sequenceNumber;
	/**
	 * 索引名/主键名(数据库)
	 */
	private String pkName;
	
	/**
	 * 主键字段名(数据库)
	 * @return
	 */
	public String getKeyTitle() {
		return keyTitle;
	}

	/**
	 * 主键字段名(数据库)
	 * @param keyTitle
	 */
	public void setKeyTitle(String keyTitle) {
		this.keyTitle = keyTitle;
	}

	/**
	 * 主键属性名(java)
	 * @return
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * 主键属性名(java)
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * 多列主键中列的序列号(数据库)
	 * @return
	 */
	public Short getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * 多列主键中列的序列号(数据库)
	 * @param sequenceNumber
	 */
	public void setSequenceNumber(Short sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * 索引名/主键名(数据库)
	 * @return
	 */
	public String getPkName() {
		return pkName;
	}

	/**
	 * 索引名/主键名(数据库)
	 * @param pkName
	 */
	public void setPkName(String pkName) {
		this.pkName = pkName;
	}

}
