package com.framework.common.database.sql;

import java.util.List;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.Table;

/**
 * @author jingmiao
 * 组装sql语句(mysql数据库)
 */
public class SqlService {
	
	/**
	 * 创建一张表结构
	 * @param table
	 * @return
	 */	
	public static String createTable(Table table){
		//create table student (id int,name varchar(50),num varchar(20) )
		List<Column> columns = table.getColumns();
		Column column = null;
		StringBuffer sb = new StringBuffer();
		sb.append("CREATE TABLE ").append(table.getTableTitle()).append(" (");
		if(columns!=null && columns.size()>0){
			int lastIndex = columns.size()-1;
			for(int i=0;i<columns.size();i++){
				column = columns.get(i);
				sb.append(column.getColumnTitle()).append(" ")
				.append(column.getColumnType());
				if(column.getColumnLength()!=null){
					sb.append("(").append(column.getColumnLength()).append(")");
				}
				if(lastIndex!=i)sb.append(",");
			}
			sb.append(")");
		}
		return sb.toString();
	}
	
	/**
	 * 删除指定的表
	 * @param tableTitle 指定的表名
	 * @return
	 */
	public static String dropTable(String tableTitle){
//		DROP TABLE table_name
		StringBuffer sb = new StringBuffer();
		sb.append("DROP TABLE ").append(tableTitle);
		return sb.toString();
	}
	
	/**
	 * 添加指定表的主键
	 * @param tableTitle 指定的表名
	 * @param keyTitle 将要设置为主键的字段名
	 * @return
	 */
	public static String addPrimaryKey(String tableTitle, String keyTitle){
		//alter table tabelname add new_field_id int(5) unsigned default 0 not null auto_increment ,add primary key (new_field_id);
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" ADD PRIMARY KEY(")
		.append(keyTitle).append(")");
		return sb.toString();
	}
	
	/**
	 * 删除指定表的主键
	 * @param tableTitle 指定表名
	 * @return
	 */
	public static String dropPrimaryKey(String tableTitle){
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" DROP PRIMARY KEY");
		return sb.toString();
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
	public static String addColumn(String tableTitle, String newColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" ADD COLUMN ")
		.append(newColumnTitle).append(" ")
		.append(newColumnType).append(" (").append(newColumnLength).append(")");
		if(newIsNotNull)sb.append(" not null");
		return sb.toString();
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
	public static String changeColumn(String tableTitle, String oldColumnTitle, String newColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" CHANGE ")
		.append(oldColumnTitle).append(" ").append(newColumnTitle).append(" ")
		.append(newColumnType).append(" (").append(newColumnLength).append(")");
		if(newIsNotNull)sb.append(" not null");
		return sb.toString();
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
	public static String modifyColumn(String tableTitle, String oldColumnTitle, String newColumnType, String newColumnLength, Boolean newIsNotNull){
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" MODIFY ")
		.append(oldColumnTitle).append(" ")
		.append(newColumnType).append(" (").append(newColumnLength).append(")");
		if(newIsNotNull)sb.append(" not null");
		return sb.toString();
	}
	
	/**
	 * 删除一个字段
	 * @param tableTitle
	 * @param oldColumnTitle
	 * @return
	 */
	public static String dropColumn(String tableTitle, String oldColumnTitle){
		StringBuffer sb = new StringBuffer();
		sb.append("ALTER TABLE ").append(tableTitle)
		.append(" DROP COLUMN ")
		.append(oldColumnTitle);
		return sb.toString();
	}
	
	/**
	 * 根据列名数组插入到指定的表中
	 * @param tableTitle 指定表名
	 * @param columns 需要插入的列名字段名
	 * @return
	 */
	public static String insert(String tableTitle,String[] columns){
		StringBuffer sb = new StringBuffer();
		StringBuffer value = new StringBuffer();
		sb.append("INSERT INTO ").append(tableTitle)
		.append(" (");
		if(columns!=null && columns.length>0){
			int lastIndex = columns.length-1;
			for(int i=0;i<columns.length;i++){
				sb.append(columns[i]);
				value.append("?");
				if(lastIndex!=i){
					sb.append(",");
					value.append(",");
				}
			}
		}
		sb.append(")")
		.append(" VALUES(").append(value.toString()).append(")");
		return sb.toString();
	}

	/**
	 * 返回sql语句及与之对应的参数
	 * @param table
	 * @return
	 */
	public static SqlColumnsModel insert(Table table) {
//		INSERT INTO tb_rule (id,paraName,type,value,parentId,score) VALUES(?,?,?,?,?,?)
		List<Column> columns = table.getColumns();
		StringBuffer sb = new StringBuffer();
		String[] column_arr = new String[columns.size()];
		String values_str = "";
		sb.append("INSERT INTO ").append(table.getTableTitle())
		.append(" (");
		if(columns!=null && columns.size()>0){
			int lastIndex = columns.size()-1;
			for(int i=0;i<columns.size();i++){
				sb.append(columns.get(i).getColumnTitle());
				column_arr[i] = columns.get(i).getColumnTitle();
				values_str += "?";
				if(lastIndex!=i){
					sb.append(",");
					values_str += ",";
				}
			}
		}
		sb.append(")")
		.append(" VALUES(").append(values_str).append(")");
		return new SqlColumnsModel(sb.toString(),column_arr);
	}
	
}
