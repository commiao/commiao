package com.commiao.ssm.service;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.commiao.ssm.domain.DataColumn;
import com.framework.common.database.jdbc.JdbcHelper;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class IDataColumnServiceTest{
	
	@Autowired
	private IDataColumnService dataColumnService;
	
	@Before
	public void before() {
		System.out.println("=====start");
	}
	
	@After
	public void after(){
		System.out.println("=====end");
	}
	
//	@Test
	public void testsave() throws Exception{
		DataColumn dc = new DataColumn();
		dc.setName("TARGET");
		StringBuffer sb = new StringBuffer(" SELECT ");
		sb.append(dc.getName());
		sb.append(" as isbol,COUNT(*) as total FROM a_model GROUP BY TARGET ");
		List<Map<String, Object>> list = JdbcHelper.getList(sb.toString());
		Integer countData = 0;
		Integer temp = null;
		Integer isbol = null;
		for(Map<String, Object> map:list){
			temp = Integer.valueOf(map.get("total").toString());
			isbol = Integer.valueOf(map.get("isbol").toString());
			if(isbol.equals(1)){
				dc.setCountDataY(temp);
			}
			if(isbol.equals(0)){
				dc.setCountDataN(temp);
			}
			countData += temp;
		}
		dc.setCountData(countData);
		dataColumnService.save(dc);
		System.out.println(dc.getId());
	}
}