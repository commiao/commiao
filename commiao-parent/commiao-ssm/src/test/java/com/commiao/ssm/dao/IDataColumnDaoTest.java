package com.commiao.ssm.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.ssm.dao.IDataColumnDao;
import com.commiao.ssm.domain.DataColumn;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class IDataColumnDaoTest{
	@Autowired
	private IDataColumnDao dataColumnDao;
	
	@Before
	public void before() {
		System.out.println("=====start");
	}
	
	@After
	public void after(){
		System.out.println("=====end");
	}
	
//	@Test
	public void testINSERT(){
		DataColumn dc = new DataColumn();
		dc.setName("TARGET");
		dataColumnDao.INSERT(dc);
		System.out.println(dc.getId());
	}
}