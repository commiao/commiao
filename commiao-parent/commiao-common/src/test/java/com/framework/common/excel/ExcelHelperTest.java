package com.framework.common.excel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.jdbc.JdbcHelper;
import com.framework.common.excel.pojo.ExcelColumn;

public class ExcelHelperTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	
//	@Test
	public void testgetTable(){
		Table table = ExcelHelper.getTableByExcel("d://book.xls");
		System.out.println(table.toString());
	}
	
//	@Test
	public void testsetExcelByTable(){
		ExcelHelper.setExcelByTableName("d://book1.xls", "a_model");
	}
	
//	@Test
	public void testsaveExcelRow(){
		String sql = "select * from common_excel_column where project_id = ? ";
		List<Object> params = new ArrayList<Object>();
		params.add(1);
		List<ExcelColumn> list;
		try {
			list = JdbcHelper.getList(sql, params, ExcelColumn.class);
			HashMap<Integer,Integer> column_ids = new HashMap<Integer, Integer>();
			for(ExcelColumn ec : list){
				column_ids.put(ec.getSort(), ec.getId());
			}
			ExcelHelper.saveExcelRow("d://book.xls", 1, column_ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testsaveExcelColumn(){
		try {
			ExcelHelper.saveExcelColumn("d://book.xls", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testgetListByExcel(){
		List<List<String>> total_list = ExcelHelper.getListByExcel("d://book.xls");
		List<String> row_list = null;
		for(int i=0;i<total_list.size();i++){
			System.out.println("====第"+i+"行=====");
			row_list = total_list.get(i);
			for(int j=0;j<row_list.size();j++){
				System.out.print("["+row_list.get(j)+"]");
			}
			System.out.println();
		}
	}
}
