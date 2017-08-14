package com.framework.common.database.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.framework.common.core.configuration.ConfigUtils;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.InsertColumnModel;
import com.framework.common.database.sql.SqlColumnsModel;
import com.framework.common.database.sql.SqlService;

public class JdbcHelper {
	private static String db_catalog = null;
	
	/**
	 * 获取数据库名（配置文件中:db.catalog）
	 * @return
	 */	
	public static void getInstance(){
		if(db_catalog==null){
			db_catalog = ConfigUtils.get("db.catalog");
		}
	}
	public static  Map<String, Object> getOne(String sql, List<Object> params)throws Exception{
		return JdbcTool.getOne(sql, params);
	}
	public static  List<Map<String, Object>> getList(String sql)throws Exception{
		return JdbcTool.getList(sql, null);
	}
	public static  List<Map<String, Object>> getList(String sql, List<Object> params)throws Exception{
		return JdbcTool.getList(sql, params);
	}
	public static <T> T getOne(String sql, List<Object> params, Class<T> cls) throws Exception{
		return JdbcTool.getOne(sql, params, cls);
	}
	public static <T> List<T> getList(String sql, List<Object> params, Class<T> cls) throws Exception{
		return JdbcTool.getList(sql, params, cls);
	}
	/**
	 * 按指定sql查询数据
	 * @param sql
	 * @param params
	 * @return
	 */
	public static List<List<Object>> getList(String sql,String[] params){
		List<List<Object>> data_list = new ArrayList<List<Object>>();
		List<Object> data = null;
        try {
        	ResultSet rs = JdbcTool.search(sql, params);
        	ResultSetMetaData rm = rs.getMetaData(); 
        	int columnNum = rm.getColumnCount(); 
            while (rs.next()) {
            	data = new ArrayList<Object>();
            	for(int j=1;j<=columnNum;j++){
            		data.add(rs.getObject(j));
            	}
            	data_list.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data_list;
	}
	
	/**
	 * 创建一张表结构
	 * @param table
	 * @return
	 */
	public static Boolean createTable(Table table){
		Boolean isSuccess = true;
		String sql = SqlService.createTable(table);
		try {
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 删除指定的表
	 * @param tableTitle 指定的表名
	 * @return
	 */
	public static Boolean dropTable(String tableTitle){
		Boolean isSuccess = true;
		String sql = SqlService.dropTable(tableTitle);
		try {
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 添加指定表的主键
	 * @param tableTitle 指定的表名
	 * @param keyTitle 将要设置为主键的字段名
	 * @return
	 */
	public static Boolean addPrimaryKey(String tableTitle, String keyTitle){
		//alter table tabelname add new_field_id int(5) unsigned default 0 not null auto_increment ,add primary key (new_field_id);
		Boolean isSuccess = true;
		String sql = SqlService.addPrimaryKey(tableTitle, keyTitle);
		try {
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 删除指定表的主键
	 * @param tableTitle 指定表名
	 * @return
	 */
	public static Boolean dropPrimaryKey(String tableTitle){
		Boolean isSuccess = true;
		String sql = SqlService.dropPrimaryKey(tableTitle);
		try {
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 添加指定表的新字段
	 * @param tableTitle 指定表名
	 * @param newColumnTitle 新增字段名
	 * @param newColumnType 新增字段类型
	 * @param newColumnLength 新增字段长度
	 * @param newIsNotNull 新增字段是否不能为空
	 * @return
	 */
	public static Boolean addColumn(String tableTitle, String newColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		Boolean isSuccess = true;
		String sql = SqlService.addColumn(tableTitle, newColumnTitle, newColumnType, newColumnLength, newIsNotNull);
		try{
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 修改指定表的指定字段的名称，此时一定要重新指定该字段的类型
	 * @param tableTitle 指定表名
	 * @param oldColumnTitle 指定已存在的字段名
	 * @param newColumnTitle 指定修改后的字段名
	 * @param newColumnType 指定修改后的字段类型
	 * @param newColumnLength 指定修改后的字段长度
	 * @param newIsNotNull 指定修改后的字段是否不能为空
	 * @return
	 */
	public static Boolean changeColumn(String tableTitle, String oldColumnTitle, String newColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		Boolean isSuccess = true;
		String sql = SqlService.changeColumn(tableTitle, oldColumnTitle, newColumnTitle, newColumnType, newColumnLength, newIsNotNull);
		try{
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 修改指定表的一个字段的类型
	 * @param tableTitle 指定表名
	 * @param oldColumnTitle 指定已存在的字段名
	 * @param newColumnType 指定修改后的字段类型
	 * @param newColumnLength 指定修改后的字段长度
	 * @param newIsNotNull 指定修改后的字段是否不能为空
	 * @return
	 */
	public static Boolean modifyColumn(String tableTitle, String oldColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		Boolean isSuccess = true;
		String sql = SqlService.modifyColumn(tableTitle, oldColumnTitle, newColumnType, newColumnLength, newIsNotNull);
		try{
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	/**
	 * 删除一个字段
	 * @param tableTitle
	 * @param oldColumnTitle
	 * @return
	 */
	public static Boolean dropColumn(String tableTitle, String oldColumnTitle){
		Boolean isSuccess = true;
		String sql = SqlService.dropColumn(tableTitle, oldColumnTitle);
		try{
			JdbcTool.update(sql, null);
		} catch (Exception e) {
			isSuccess = false;
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static int update(String tableTitle,String[] columns,String[] params){
		String sql = SqlService.insert(tableTitle, columns);
		int j = 0;
		try{
			j = JdbcTool.update(sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}
	
	public static Long insert(String tableTitle,String[] columns, Object[] params) throws SQLException{
		String sql = SqlService.insert(tableTitle, columns);
		showSql(sql, params);
		return JdbcTool.insert(sql, params);
	}
	
	public static Long insert(String tableTitle,List<InsertColumnModel> params){
		String[] columns = new String[params.size()];
		for(int i=0;i<params.size();i++){
			columns[i] = params.get(i).getColumnTitle();
		}
		String sql = SqlService.insert(tableTitle, columns);
		Long id = -1l; 
		try {
			showSql(sql, params);
			String[] arr = new String[params.size()];
			for(int i = 0; i<params.size() ; i++){
        		InsertColumnModel model = params.get(i);
        		arr[i] = model.getStrValue();
			}
			id = JdbcTool.insert(sql, arr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	/**
	 * 打印sql语句
	 * @param sql
	 * @param params
	 * @return
	 */
	public static String showSql(String sql, List<InsertColumnModel> params) {
        if(params != null && params.size()>0){
        	for(int i = 0; i<params.size() ; i++){
        		InsertColumnModel model = params.get(i);
    			sql=sql.replaceFirst("\\?",model.getStrValue());
        	}
        }
        System.out.println(sql);
        return sql;
	}
	public static String showSql(String sql, Object[] params) {
        if(params != null && params.length>0){
        	for(int i = 0; i<params.length ; i++){
    			sql=sql.replaceFirst("\\?",params[i].toString());
        	}
        }
        System.out.println(sql);
        return sql;
	}
	
	/**
	 * 插入table对象中的数据到已有的表中
	 * @param table
	 * @return
	 */
	public static int insert(Table table){
		SqlColumnsModel model = SqlService.insert(table);
		HashMap<String,Object> data = null;
		String[] columns = model.getColumns();
		String[] params = null;
		int i = 0;
		try{
			for(i=0;i<table.getDataCollection().size();i++){
				data = table.getDataCollection().get(i);
				params = new String[columns.length];
				for(int j=0;j<columns.length;j++){
					params[j]=(String) data.get(columns[j]);
				}
				JdbcTool.update(model.getSql(), params);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
}
