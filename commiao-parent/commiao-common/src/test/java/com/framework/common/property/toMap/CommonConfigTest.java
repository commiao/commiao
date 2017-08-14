package com.framework.common.property.toMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.CommonConstants;
import com.framework.common.property.toMap.CommonConfig;
import com.framework.common.property.toMap.LoadPopertiesFile;

public class CommonConfigTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}
	@After
	public void setDown(){
		System.out.println("after");
	}

	@Test
	public void testProperties() {
		LoadPopertiesFile.loadSqlFile(CommonConstants.PROPERITIES_URL);          
        String sql = CommonConfig.loadSqlMap.get("generator.db.driver"); 
        String pwd = CommonConfig.loadSqlMap.get("db.pwd");
        System.out.println("sql:"+sql);
        System.out.println("pwd:"+pwd);
	}
	
}
