package com.framework.common.core.domain.model.database;

import java.util.List;

/**
 * @author jingmiao
 *	数据库
 */
public class Database {
	/**
	 * 数据库名字(数据库)
	 */
	private String databaseTitle;
	/**
	 * 拥有的表集合
	 */
	private List<Table> tables;
	
	/**
	 * 数据库名字(数据库)
	 * @return
	 */
	public String getDatabaseTitle() {
		return databaseTitle;
	}
	/**
	 * 数据库名字(数据库)
	 * @param databaseTitle
	 */
	public void setDatabaseTitle(String databaseTitle) {
		this.databaseTitle = databaseTitle;
	}
	/**
	 * 拥有的表集合
	 * @return
	 */
	public List<Table> getTables() {
		return tables;
	}
	/**
	 * 拥有的表集合
	 * @param tables
	 */
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	
}
