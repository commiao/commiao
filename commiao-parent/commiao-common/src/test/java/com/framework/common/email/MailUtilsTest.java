package com.framework.common.email;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.email.Email;
import com.framework.common.email.MailUtils;
import com.framework.common.email.TextMailMessage;

public class MailUtilsTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	
//	@Test
    public void testsendTextMail() {
	    MailUtils.sendTextMail("jingmiao0924@163.com", "测试003", "测试成功");
	}
	
//	@Test
	public void testEmail(){
		TextMailMessage text = new TextMailMessage("jingmiao0924@163.com", "测试004", "测试成功");
		Email.getInstance().sendMail(text);
	}
}
