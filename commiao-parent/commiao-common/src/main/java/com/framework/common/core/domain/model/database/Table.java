package com.framework.common.core.domain.model.database;

import java.util.HashMap;
import java.util.List;

/**
 * @author jingmiao
 *	表
 */
public class Table {
	/**
	 * 表名(数据库)
	 */
	private String tableTitle;
	/**
	 * 类名(java)
	 */
	private String className;
	/**
	 * 拥有的字段集合
	 */
	private List<Column> columns;
	/**
	 * 表注释
	 */
	private String remarks;
	/**
	 * 拥有的主键集合
	 */
	private List<PrimaryKey> primaryKeys;
	/**
	 * 表中的数据集合
	 */
	private List<HashMap<String,Object>> dataCollection;
	
	/**
	 * 表名(数据库)
	 * @return
	 */
	public String getTableTitle() {
		return tableTitle;
	}
	/**
	 * 表名(数据库)
	 * @param tableTitle
	 */
	public void setTableTitle(String tableTitle) {
		this.tableTitle = tableTitle;
	}
	/**
	 * 类名(java)
	 * @return
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * 类名(java)
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * 拥有的字段集合
	 * @return
	 */
	public List<Column> getColumns() {
		return columns;
	}
	/**
	 * 拥有的字段集合
	 * @param columns
	 */
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}
	/**
	 * 表注释
	 * @return
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 表注释
	 * @param remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 主键名(数据库)
	 * @return
	 */
	public List<PrimaryKey> getPrimaryKeys() {
		return primaryKeys;
	}
	/**
	 * 主键名(数据库)
	 * @param primaryKeys
	 */
	public void setPrimaryKeys(List<PrimaryKey> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
	/**
	 * 表中的数据集合
	 * @return
	 */
	public List<HashMap<String,Object>> getDataCollection() {
		return dataCollection;
	}
	/**
	 * 表中的数据集合
	 * @param dataCollection
	 */
	public void setDataCollection(List<HashMap<String,Object>> dataCollection) {
		this.dataCollection = dataCollection;
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		String column = null;
		sb.append("1==");	
		for(int j=0;j<getColumns().size();j++){
			sb.append("["+getColumns().get(j).getColumnTitle()+"]");
		}
		sb.append("\n");
		HashMap<String,Object> map = null;	
		for(int i=0;i<getDataCollection().size();i++){
			sb.append((i+2)+"==");
			map = getDataCollection().get(i);
			for(int j=0;j<getColumns().size();j++){
				column = getColumns().get(j).getColumnTitle();
				sb.append("["+map.get(column)+"],");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
