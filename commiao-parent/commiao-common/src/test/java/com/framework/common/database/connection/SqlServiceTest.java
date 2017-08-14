package com.framework.common.database.connection;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.sql.SqlColumnsModel;
import com.framework.common.database.sql.SqlService;

public class SqlServiceTest {
	private static Table table = null;
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
	public void testcreateTable(){
		String sql = SqlService.createTable(table);
		System.out.println(sql);
	}
	
//	@Test
	public void testinsert1(){
		String[] columns = {"id","index","title"};
		String sql = SqlService.insert("common_excel_column", columns);
		System.out.println(sql);
	}
	
//	@Test
	public void testinsert2(){
		SqlColumnsModel model = SqlService.insert(table);
		System.out.println(model.getSql());
		String str = "";
		for(int i=0;i<model.getColumns().length;i++){
			str += model.getColumns()[i]+",";
		}
		System.out.println(str);
	}
	
//	@Test
	public void testdropTable(){
		String sql = SqlService.dropTable("teacher");
		System.out.println(sql);
	}
}
