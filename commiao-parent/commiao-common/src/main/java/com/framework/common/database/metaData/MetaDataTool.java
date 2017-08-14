package com.framework.common.database.metaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.PrimaryKey;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.connection.ConnectionTool;
import com.framework.common.database.jdbc.JdbcTool;

public class MetaDataTool {
	private static Connection connection = ConnectionTool.getInstance();
	private static DatabaseMetaData databaseMetaData = null;
	
	/**
	 * 建立数据库连接
	 * @return
	 */
	public static void getInstance(){
		if(databaseMetaData==null){
			databaseMetaData = getDatabaseMetaData();
		}
	}
	
    /**
     * 获取数据库信息
     * @return
     */
    private static DatabaseMetaData getDatabaseMetaData(){
    	if(databaseMetaData==null){
	    	try {
				databaseMetaData = connection.getMetaData();
				//用以获得当前数据库是什么数据库。比如oracle，access等。返回的是字符串。
				System.out.println("数据库："+databaseMetaData.getDatabaseProductName());
				//获得数据库的版本。返回的字符串。
				System.out.println("版本："+databaseMetaData.getDatabaseProductVersion());
				//获得驱动程序的版本。返回字符串。
				System.out.println("驱动："+databaseMetaData.getDriverVersion());
				//获得当前数据库的类型信息
				System.out.println("类型："+databaseMetaData.getTypeInfo());
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	return databaseMetaData;
    }
	
	/**
	 * 获取数据库列
	 * @param catalog 指定数据库名
	 * @param schemaPattern 
	 * @param tableNamePattern 指定表名
	 * @param columnNamePattern 指定列名
	 * @return
	 * @throws SQLException
	 */
	public static List<Column> getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException{
		getInstance();
		ResultSet resultSet = databaseMetaData.getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern);
		List<Column> list = new ArrayList<Column>();
		while (resultSet.next()) {
			Column c = new Column();
			c.setColumnTitle(resultSet.getString(4));//列的名称
			c.setColumnType(resultSet.getString(5));//SQL类型
			c.setColumnTypeName(resultSet.getString(6));//类型名称
			c.setColumnLength(resultSet.getInt(7));//列的大小
			list.add(c);
		}
		resultSet.close();
		return list;
	}
	
	/**
	 * 获取数据库表主键
	 * @param catalog 
	 * @param schemaPattern
	 * @param tableNamePattern
	 * @return
	 * @throws SQLException
	 */
	public static List<PrimaryKey> getPrimaryKeys(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
		getInstance();
		ResultSet resultSet = databaseMetaData.getPrimaryKeys(catalog, schemaPattern, tableNamePattern);
		List<PrimaryKey> list = new ArrayList<PrimaryKey>();
		while (resultSet.next()) {
			PrimaryKey p = new PrimaryKey();
			p.setKeyTitle(resultSet.getString(4));//主键字段名
			p.setSequenceNumber(resultSet.getShort(5));//多列主键中列的序列号
			p.setPkName(resultSet.getString(6));//索引名
			list.add(p);
		}
		resultSet.close();
		return list;
	}
	
	/**
	 * 获取数据库表
	 * @param catalog 要获得表所在的编目。"“”"意味着没有任何编目，Null表示所有编目。
	 * @param schemaPattern 要获得表所在的模式。"“”"意味着没有任何模式，Null表示所有模式。
	 * @param tableNamePattern 指出要返回表名与该参数匹配的那些表，
	 * @param types 指出返回何种表的数组："TABLE"、"VIEW"、"SYSTEM TABLE"， "GLOBAL TEMPORARY"，"LOCAL  TEMPORARY"，"ALIAS"，"SYSNONYM"。
	 * @return
	 * @throws SQLException
	 */
	public static List<Table> getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException {
		getInstance();
		ResultSet resultSet = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern, types);
		List<Table> list = new ArrayList<Table>();
		while (resultSet.next()) {
			Table t = new Table();
			t.setTableTitle(resultSet.getString(3));//表名
			t.setRemarks(resultSet.getString(5));//表注释
			list.add(t);
		}
		resultSet.close();
		return list;
	}
	
	/**
	 * 获取指定表的信息(表名+注释+字段+结果集)
	 * @param catalog 指定数据库名
	 * @param tableNamePattern 指定表名
	 * @return
	 */
	public static Table getTable(String catalog, String tableNamePattern){
		Table table = null;
		List<Column> columns = null;
		List<PrimaryKey> primaryKeys = null;
		List<HashMap<String,Object>> dataCollection = null;
		try {
			table = getTables(catalog, null, tableNamePattern, new String[] { "TABLE" }).get(0);
			if(table!=null){
				columns = getColumns(catalog, null, tableNamePattern, null);
				table.setColumns(columns);
				primaryKeys = getPrimaryKeys(catalog, null, tableNamePattern);
				table.setPrimaryKeys(primaryKeys);
			}
			if(columns!=null && columns.size()>0){
				dataCollection = getDataCollectionFromDB(tableNamePattern, columns);
				table.setDataCollection(dataCollection);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return table;
	}
	
	/**
	 * 从数据库获取指定表的结果集
	 * @param tableName 指定表
	 * @param columns 表的列
	 * @return
	 */
	private static List<HashMap<String,Object>> getDataCollectionFromDB(String tableName,List<Column> columns){
		String sql = "select * from "+tableName;
		List<HashMap<String,Object>> dataCollection= new ArrayList<HashMap<String,Object>>();;
        try {
        	ResultSet rs = JdbcTool.search(sql, null);
        	String columnTitle = null;
        	HashMap<String,Object> map = null;
            while (rs.next()) {
            	map = new HashMap<String, Object>();
            	for(int j=0;j<columns.size();j++){
            		columnTitle = columns.get(j).getColumnTitle();
            		map.put(columnTitle, rs.getString(columnTitle));
            	}
            	dataCollection.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataCollection;
	}
	
}
