package com.framework.common.database.connection;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.jdbc.JdbcHelper;
import com.framework.common.excel.ExcelHelper;
import com.framework.common.excel.pojo.ExcelColumn;

public class JdbcHelperTest {
	private Table table = null;
	@Before
	public void setUp() throws Exception {
		
		table = new Table();
		table.setTableTitle("teacher");
		List<Column> columns = new ArrayList<Column>();
		Column column1 = new Column();
		column1.setColumnTitle("id");
		column1.setColumnType("int");
		column1.setColumnLength(10);
		columns.add(column1);
		Column column2 = new Column();
		column2.setColumnTitle("name");
		column2.setColumnType("varchar");
		column2.setColumnLength(50);
		columns.add(column2);
		Column column3 = new Column();
		column3.setColumnTitle("age");
		column3.setColumnType("datetime");
		columns.add(column3);
		table.setColumns(columns);
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}
	
//	@Test
	public void testgetList(){
    	String sql="select * from user_main";
    	String[] params=null;
    	List<List<Object>> data_list = JdbcHelper.getList(sql, params);
    	List<Object> list = null;
    	for(int i=0;i<data_list.size();i++){
    		System.out.println("第"+i+"行");
    		list = data_list.get(i);
    		for(int j=0;j<list.size();j++){
    			System.out.print(list.get(j)==null?"NULL,":list.get(j).toString()+",");
    		}
    		System.out.println();
    	}
	}
	
//	@Test
	public void createTable(){
		Boolean bol = JdbcHelper.createTable(table);
		System.out.println(bol?"创建表成功":"创建表失败");
	}
	
//	@Test
	public void testaddPrimaryKey(){
		Boolean bol = JdbcHelper.addPrimaryKey("student", "id");
		System.out.println(bol?"添加主键成功":"添加主键失败");
	}
	
//	@Test
	public void testdropPrimaryKey(){
		Boolean bol = JdbcHelper.dropPrimaryKey("student");
		System.out.println(bol?"删除主键成功":"删除主键失败");
	}
	
//	@Test
	public void testaddColumn(){
		JdbcHelper.addColumn("student", "new1", "int", "10", false);
	}
	
//	@Test
	public void testchangeColumn(){
		JdbcHelper.changeColumn("student", "number", "num", "varchar", "10", true);
	}
	
//	@Test
	public void testmodifyColumn(){
		JdbcHelper.modifyColumn("student", "new1", "int", "10", true);
	}
	
//	@Test
	public void testdropColumn(){
		JdbcHelper.dropColumn("student", "new1");
	}
	
//	@Test
	public void testdropTable(){
		JdbcHelper.dropTable("e_model");
	}
	
//	@Test
	public void testinsert(){
		JdbcHelper.dropTable("e_model");
		Table table = ExcelHelper.getTableByExcel("d://book.xls");
		table.setTableTitle("a_model");
		for(Column c:table.getColumns()){
			c.setColumnType("varchar");
			c.setColumnLength(50);
		}
		Boolean bol = JdbcHelper.createTable(table);
		int rows = JdbcHelper.insert(table);
	}
	
//	@Test
	public void testgetOne(){
		String sql = "select * from common_excel_column where id=? and title=?";
		List<Object> params = new ArrayList<Object>();
		params.add(67);
		params.add("SALARY_AMT");
		ExcelColumn ec = null;
		try {
			ec = JdbcHelper.getOne(sql, params, ExcelColumn.class);
			System.out.println(ec.getId()+"==="+ec.getTitle()+"==="+ec.getSort());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	@Test
	public void testgetList2(){
		String sql = "select * from common_excel_column where project_id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(1);
		List<ExcelColumn> list;
		try {
			list = JdbcHelper.getList(sql, params, ExcelColumn.class);
			for(ExcelColumn ec : list){
				System.out.println(ec.getId()+"==="+ec.getTitle()+"==="+ec.getSort());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
