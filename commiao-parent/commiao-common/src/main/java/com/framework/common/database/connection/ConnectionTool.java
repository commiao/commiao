package com.framework.common.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.framework.common.core.configuration.ConfigUtils;

public class ConnectionTool {
	          
    private static Connection connection = null;
    
    public static Connection getInstance(){
    	if(connection==null){
    		connection = getConnection();
    	}
    	return connection;
    }

	/**
	 * 获取数据库链接
	 * @return
	 */
	private static Connection getConnection() {
		String db_driver = ConfigUtils.get("db.driver");
		String db_url = ConfigUtils.get("db.url");
		String db_user = ConfigUtils.get("db.user");
		String db_pwd = ConfigUtils.get("db.pwd");
		if (connection == null) {
			System.out.println(db_driver);
			try {
				Class.forName(db_driver);
				connection = DriverManager.getConnection(db_url, db_user, db_pwd);
			} catch (SQLException ex) {
				ex.printStackTrace();
				System.out.print("获取连接异常");
			} catch (ClassNotFoundException ex) {
				System.out.print("加载驱动出错");
				ex.printStackTrace();
				;
			}
		}
		return connection;
	}
    
}