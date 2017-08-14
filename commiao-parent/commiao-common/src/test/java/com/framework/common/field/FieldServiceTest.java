package com.framework.common.field;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.excel.pojo.ExcelColumn;

public class FieldServiceTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	
//	@Test
	public void testgetKey(){
		String[] arr = FieldService.getKeysToArr(ExcelColumn.class);
		System.out.println(StringUtils.join(arr, ","));
	}
}
