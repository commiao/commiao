package com.framework.common.database;

public enum ColumnType {
	/**
	 * int 0
	 */
	Int("0"),
	/**
	 * char 1
	 */
	Char("1"),
	/**
	 * varchar 2
	 */
	Varchar("2"),
	/**
	 * datetime 3
	 */
	Datetime("3");

	private String columnType;
	 
	ColumnType(String columnType){
		this.columnType = columnType;
	}
	
	public String value(){
		return columnType;
	}
}
