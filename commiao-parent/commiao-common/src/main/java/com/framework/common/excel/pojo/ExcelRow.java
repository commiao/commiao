package com.framework.common.excel.pojo;

public class ExcelRow {
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 对应的值
	 */
	private String value;
	/**
	 * 第几行(从0开始)
	 */
	private Integer index;
	/**
	 * 对应的列主键
	 */
	private Long coumn_id;
	
	public ExcelRow(String value, Integer index, Long coumn_id) {
		this.value = value;
		this.index = index;
		this.coumn_id = coumn_id;
	}
	
	/**
	 * 主键
	 * @return
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 主键
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 对应的值
	 * @return
	 */
	public String getValue() {
		return value;
	}
	/**
	 * 对应的值
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 第几行(从0开始)
	 * @return
	 */
	public Integer getIndex() {
		return index;
	}
	/**
	 * 第几行(从0开始)
	 * @param index
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}
	/**
	 * 对应的列主键
	 * @return
	 */
	public Long getCoumn_id() {
		return coumn_id;
	}
	/**
	 * 对应的列主键
	 * @param coumn_id
	 */
	public void setCoumn_id(Long coumn_id) {
		this.coumn_id = coumn_id;
	}
	
}
