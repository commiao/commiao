package com.framework.common.database.connection;

import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.domain.model.database.Column;
import com.framework.common.core.domain.model.database.PrimaryKey;
import com.framework.common.core.domain.model.database.Table;
import com.framework.common.database.metaData.MetaDataHelper;

public class MetaDataHelperTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}
	
//	@Test
	public void testgetColumn(){
    	List<Column> list = MetaDataHelper.getColumns("user_main");
    	for(Column c:list){
    		System.out.println(c.getColumnTitle()+"#"+c.getColumnType()+"#"+c.getColumnTypeName()+"#"+c.getColumnLength());
    	}
	}
	
//	@Test
	public void testgetTableMany(){
		List<Table> list = MetaDataHelper.getTables();
		for(Table t:list){
			System.out.println(t.getTableTitle()+"#"+t.getRemarks());
		}
	}
	
//	@Test
	public void testgetPrimaryKey(){
		List<PrimaryKey> list = MetaDataHelper.getPrimaryKeys("user_main");
		for(PrimaryKey p:list){
			System.out.println(p.getKeyTitle()+"#"+p.getSequenceNumber()+"#"+p.getPkName());
		}
	}
	
//	@Test
	public void testgetTableOne(){
		Table table = MetaDataHelper.getTable("user_main");
		System.out.println(table.getTableTitle()+"#"+table.getRemarks());
		List<Column> columns = table.getColumns();
		String s ="";
		for(Column c:columns){
			s += c.getColumnTitle()+"#";
		}
		System.out.println(s);
		String y = "";
		for(PrimaryKey key: table.getPrimaryKeys()){
			y += key.getKeyTitle() + "&";
		}
		System.out.println(y);
		for(HashMap<String,Object> map : table.getDataCollection()){
			String x = "";
			for(Column c:columns){
				x += map.get(c.getColumnTitle())+"$";
			}
			System.out.println(x);
		}
	}
	
//	@Test
	public void testgetTableList(){
		List<Table> list = MetaDataHelper.getTableList();
		for(Table t:list){
			System.out.println("====start====="+t.getTableTitle()+"#"+t.getRemarks());
			List<Column> columns = t.getColumns();
			String s ="";
			for(Column c:columns){
				s += c.getColumnTitle()+"#";
			}
			System.out.println(s);
			String y = "";
			for(PrimaryKey key: t.getPrimaryKeys()){
				y += key.getKeyTitle() + "&";
			}
			System.out.println(y);
			for(HashMap<String,Object> map : t.getDataCollection()){
				String x = "";
				for(Column c:columns){
					x += map.get(c.getColumnTitle())+"$";
				}
				System.out.println(x);
			}
			System.out.println("====end=====");
		}
	}
	
}
