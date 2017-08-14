package com.framework.common.database.jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.framework.common.database.connection.ConnectionTool;

public class JdbcTool {
	private static Connection connection = ConnectionTool.getInstance();
	private static ResultSet resultSet = null;
	private static PreparedStatement perstmt = null;
	
	/**
	 * 查询单条记录
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static Map<String, Object> getOne(String sql, List<Object> params) throws SQLException {
		Map<String, Object> map = new HashMap<String, Object>();
		int index = 1;
		perstmt = connection.prepareStatement(sql);
		if (params != null && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i++) {
				perstmt.setObject(index++, params.get(i));
			}
		}
		resultSet = perstmt.executeQuery();// 返回查询结果
		ResultSetMetaData metaData = resultSet.getMetaData();
		int col_len = metaData.getColumnCount();
		while (resultSet.next()) {
			for (int i = 0; i < col_len; i++) {
//				String cols_name = metaData.getColumnName(i + 1);// 字段名
				String cols_name = metaData.getColumnLabel(i + 1);// 字段的别名
				Object cols_value = resultSet.getObject(cols_name);
				if (cols_value == null) {
					cols_value = "";
				}
				map.put(cols_name, cols_value);
			}
		}
		return map;
	}

	/**
	 * 查询多条记录
	 * @param sql
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public static List<Map<String, Object>> getList(String sql, List<Object> params) throws SQLException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		int index = 1;
		perstmt = connection.prepareStatement(sql);
		if (params != null && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i++) {
				perstmt.setObject(index++, params.get(i));
			}
		}
		resultSet = perstmt.executeQuery();
		ResultSetMetaData metaData = resultSet.getMetaData();
		int cols_len = metaData.getColumnCount();
		while (resultSet.next()) {
			Map<String, Object> map = new HashMap<String, Object>();
			for (int i = 0; i < cols_len; i++) {
//				String cols_name = metaData.getColumnName(i + 1);// 字段名
				String cols_name = metaData.getColumnLabel(i + 1);// 字段的别名
				Object cols_value = resultSet.getObject(cols_name);
				if (cols_value == null) {
					cols_value = "";
				}
				map.put(cols_name, cols_value);
			}
			list.add(map);
		}

		return list;
	}
	
	/**通过反射机制查询单条记录 
     * @param sql 
     * @param params 
     * @param cls 
     * @return 
     * @throws Exception 
     */  
    public static <T> T getOne(String sql, List<Object> params, Class<T> cls) throws Exception{  
        T resultObject = null;  
        int index = 1;  
        perstmt =connection.prepareStatement(sql);
        if(params != null && !params.isEmpty()){  
            for(int i = 0; i<params.size(); i++){  
            	perstmt.setObject(index++, params.get(i));  
            }  
        }  
        resultSet = perstmt.executeQuery();  
        ResultSetMetaData metaData  = resultSet.getMetaData();  
        int cols_len = metaData.getColumnCount();  
        while(resultSet.next()){  
            //通过反射机制创建一个实例  
            resultObject = cls.newInstance();  
            for(int i = 0; i<cols_len; i++){  
//				String cols_name = metaData.getColumnName(i + 1);// 字段名
				String cols_name = metaData.getColumnLabel(i + 1);// 字段的别名 
                Object cols_value = resultSet.getObject(cols_name);  
                if(cols_value == null){  
                    cols_value = "";  
                }  
                Field field = cls.getDeclaredField(cols_name);  
                field.setAccessible(true); //打开javabean的访问权限  
                field.set(resultObject, cols_value);  
            }  
        }  
        return resultObject;  
  
    }
    
    /**通过反射机制查询多条记录 
     * @param sql  
     * @param params 
     * @param cls 
     * @return 
     * @throws Exception 
     */  
    public static <T> List<T> getList(String sql, List<Object> params, Class<T> cls)throws Exception {  
        List<T> list = new ArrayList<T>();  
        int index = 1;  
        perstmt =connection.prepareStatement(sql);
        if(params != null && !params.isEmpty()){  
            for(int i = 0; i<params.size(); i++){  
            	perstmt.setObject(index++, params.get(i));  
            }  
        }  
        resultSet = perstmt.executeQuery();  
        ResultSetMetaData metaData  = resultSet.getMetaData();  
        int cols_len = metaData.getColumnCount();  
        while(resultSet.next()){  
            //通过反射机制创建一个实例  
            T resultObject = cls.newInstance();  
            for(int i = 0; i<cols_len; i++){  
//				String cols_name = metaData.getColumnName(i + 1);// 字段名
				String cols_name = metaData.getColumnLabel(i + 1);// 字段的别名 
                Object cols_value = resultSet.getObject(cols_name);  
                if(cols_value == null){  
                    cols_value = "";  
                }  
                Field field = cls.getDeclaredField(cols_name);  
                field.setAccessible(true); //打开javabean的访问权限  
                field.set(resultObject, cols_value);  
            }  
            list.add(resultObject);  
        }  
        return list;  
    }  
  
    
    /**
     * 查询
     * @param sql
     * @param params
     * @return
     * @throws SQLException 
     */
    public static ResultSet search(String sql, String params[]) throws SQLException {
    	perstmt =connection.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
            	perstmt.setString(i + 1, params[i]);
            }
        }
        resultSet = perstmt.executeQuery();
        return resultSet;
    }

    /**
     * 增删改
     * @param sql
     * @param params
     * @return
     * @throws SQLException 
     */
    public static int update(String sql, Object params[]) throws SQLException {
    	perstmt = connection.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
            	perstmt.setObject(i + 1, params[i]);
            }
        }
        return perstmt.executeUpdate();
    }
    
    /**
     * 插入一条数据 并返回主键id
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public static Long insert(String sql, Object params[]) throws SQLException{
    	perstmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        if(params != null && params.length>0){
        	for(int i = 0; i<params.length ; i++){
        		perstmt.setObject(i + 1, params[i]);
        	}
        }
        perstmt.executeUpdate();
        // 检索由于执行此 Statement 对象而创建的所有自动生成的键 
        resultSet = perstmt.getGeneratedKeys(); 
        Long id = -1l;
        if (resultSet.next()) { 
        	id = resultSet.getLong(1); 
    	} 
        return id;
    }
    
//    /**
//     * 插入一条数据 并返回主键id
//     * @param sql
//     * @param params
//     * @return
//     * @throws SQLException
//     */
//    public static Long insert(String sql, List<InsertColumnModel> params) throws SQLException {
//    	perstmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//        if(params != null && params.size()>0){
//        	for(int i = 0; i<params.size() ; i++){
//        		InsertColumnModel model = params.get(i);
////        		if(ColumnType.Int.value().equals(model.getColumnType())){
////        			perstmt.setInt(i+1, model.getIntValue());
////        		}
////        		if(ColumnType.Varchar.value().equals(model.getColumnType())){
////        			perstmt.setString(i+1, model.getStrValue());
////        		}
//        		perstmt.setObject(i + 1, model.getValue());
//        	}
//        }
//        perstmt.executeUpdate();
//        // 检索由于执行此 Statement 对象而创建的所有自动生成的键 
//        resultSet = perstmt.getGeneratedKeys(); 
//        Long id = -1l;
//        if (resultSet.next()) { 
//        	id = resultSet.getLong(1); 
//    	} 
//        return id;
//    }

    /**
     * 关闭数据库链接
     */
    public static void release(){
        if(connection!=null){
            try{
                //关闭存储查询结果的ResultSet对象
            	connection.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            connection = null;
        }
        if(resultSet!=null){
            try{
                //关闭Connection数据库连接对象
            	resultSet.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
