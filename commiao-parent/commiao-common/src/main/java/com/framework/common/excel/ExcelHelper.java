package com.framework.common.excel;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.framework.common.core.domain.model.database.Table;
import com.framework.common.core.domain.model.json.MessageJson;
import com.framework.common.core.domain.model.json.MessageJson.MessageResult;
import com.framework.common.database.InsertColumnModel;
import com.framework.common.database.jdbc.JdbcHelper;
import com.framework.common.database.metaData.MetaDataHelper;


public class ExcelHelper {
	/**
	 * 将excel文件转换数据库table对象
	 * @param fileUrl 将要读取的excel文件路径 "D://book.xls"
	 * @return
	 */
	public static Table getTableByExcel(String fileUrl){
		MessageJson json = ExcelService.getTableByExcel(fileUrl);
		if(json.getResult().equals(MessageResult.fail)){
			System.out.println(json.getMessage());
		}else{
			System.out.println(json.getMessage());
		}
		return (Table) json.getItem();
	}
	
	/**
	 * 将数据库表写入excel文件
	 * @param fileUrl 将要写入的excel文件路径 "D://book001.xls"
	 * @param tableName 数据库表名 user_main
	 */
	public static void setExcelByTableName(String fileUrl,String tableName){
		Table table = MetaDataHelper.getTable(tableName);
		MessageJson json = ExcelService.setTableToExcel(fileUrl, table);
		if(json.getResult().equals(MessageResult.fail)){
			System.out.println(json.getMessage());
		}else{
			System.out.println(json.getMessage());
		}
	}
	
	
	/**
	 * 执行持久化结果集
	 * @param list
	 * @return
	 */
	public static int insertList(List<List<InsertColumnModel>> list){
		Integer i;
		for(i=0;i<list.size();i++){
			JdbcHelper.insert("common_excel_column", list.get(i));
		}
		return i;
	}
	
	/**
	 * 将excel中的列保存到common_excel_column表中
	 * @param fileUrl
	 * @param project_id
	 * @throws SQLException
	 */
	public static void saveExcelColumn(String fileUrl,Integer project_id) throws SQLException{
		List<String> row = ExcelService.getRowByIndex(fileUrl, 0);
		String[] columns = { "title", "sort", "project_id" };
		String[] params = null;
		for(int x=0;x<row.size();x++){
			params = new String[columns.length];
			params[0] = row.get(x);
			params[1] = x + "";
			params[2] = project_id.toString();
			JdbcHelper.insert("common_excel_column", columns, params);
		}
		
	}
	
	/**
	 * 将excel文件中的数据全部保存到common_excel_row表中
	 * @param fileUrl 将要读取的excel文件位置
	 * @param row 从第几行开始(默认是0)
	 * @param column_ids <column_index,column_id>
	 * @throws SQLException
	 */
	public static void saveExcelRow(String fileUrl, Integer row, HashMap<Integer, Integer> column_ids) throws SQLException {
		List<List<String>> total_list = getListByExcel(fileUrl);
		List<String> row_list = null;
		String[] columns = { "value", "sort", "column_id" };
		String[] params = null;
		for (int i = 0; i < total_list.size(); i++) {
			row_list = total_list.get(i);
			for (int j = row; j < row_list.size(); j++) {
				params = new String[columns.length];
				params[0] = row_list.get(j);
				params[1] = i + "";
				params[2] = column_ids.get(j).toString();
				JdbcHelper.insert("common_excel_row", columns, params);
			}
		}
	}
	
	/**
	 * 将excel格式数据转换为List[List[Object]]
	 * @param fileUrl
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<List<String>> getListByExcel(String fileUrl){
		MessageJson json = ExcelService.getListByExcel(fileUrl);
		List<List<String>> list = null;
		if(json.getResult().equals(MessageResult.fail)){
			System.out.println(json.getMessage());
		}else{
			System.out.println(json.getMessage());
			list = (List<List<String>>) json.getItems();
		}
		return list;
	}
}
