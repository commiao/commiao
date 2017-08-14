package com.framework.common.database.metaData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.framework.common.core.configuration.ConfigUtils;
import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.PrimaryKey;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.metaData.MetaDataTool;

public class MetaDataHelper {
	private static String db_catalog = null;
	
	/**
	 * 获取数据库名（配置文件中:db.catalog）
	 * @return
	 */	
	public static void getInstance(){
		if(db_catalog==null){
			db_catalog =ConfigUtils.get("db.catalog");
		}
	}
	
	/**
	 * 获取表全部列名
	 * @param tableNamePattern 指定表名
	 * @return
	 * @throws SQLException
	 */
	public static List<Column> getColumns(String tableNamePattern){
		getInstance();
		try {
			return MetaDataTool.getColumns(db_catalog, null, tableNamePattern, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取指定表的全部主键名
	 * @param tableNamePattern 指定表名
	 * @return
	 */
	public static List<PrimaryKey> getPrimaryKeys(String tableNamePattern){
		getInstance();
		try {
			return MetaDataTool.getPrimaryKeys(db_catalog, null, tableNamePattern);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取数据库全部表名
	 * @return
	 * @throws SQLException
	 */
	public static List<Table> getTables(){
		getInstance();
		try{
			return MetaDataTool.getTables(db_catalog, null, null, new String[] { "TABLE" });
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取指定表的信息(表名+注释+字段+结果集)
	 * @param tableNamePattern 指定数据库名
	 * @return
	 */
	public static Table getTable(String tableNamePattern){
		getInstance();
		Table table = MetaDataTool.getTable(db_catalog, tableNamePattern);
		return table;
	}
	
	/**
	 * 获取默认数据库(配置文件中:db.catalog)的全部表信息(表名+注释+字段+结果集)
	 * @return
	 */
	public static List<Table> getTableList(){
		List<Table> list = new ArrayList<Table>();
		for(Table t:getTables()){
			list.add(getTable(t.getTableTitle()));
		}
		return list;
	}
	
}
