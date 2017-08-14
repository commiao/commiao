package com.framework.common.configuration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.framework.common.core.CommonConstants;
import com.framework.common.core.configuration.ConfigUtils;

public class ConfigUtilsTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	@Test
	public void testget(){
//		String login_url = ConfigUtils.get(CommiaoConstants.CONFIG_LOGIN_URL, "/") ;
//		System.out.println(login_url);
//		System.out.println(ConfigUtils.get("mail.MAIL_PORT", "MAIL_PORT"));
//		System.out.println(ConfigUtils.get("mail.MAIL_SERVER", "MAIL_SERVER"));//邮件服务器
//		System.out.println(ConfigUtils.get("mail.MAIL_FROM", "MAIL_FROM"));//发送者
//		System.out.println(ConfigUtils.get("mail.MAIL_USER", "MAIL_USER"));//发送者地址
//		System.out.println(ConfigUtils.get("mail.MAIL_PASSWORD", "MAIL_PASSWORD"));//密码
//		System.out.println(ConfigUtils.getLong("mail.MAIL_INTERVAL", 1));//两次发送间隔的毫秒数
//		System.out.println(ConfigUtils.getInt("mail.MAIL_MAX_SEND_COUNT", 1));//如果发送出现错误，最大的重试次数
//		System.out.println(ConfigUtils.getBoolean("mail.MAIL_TLS", false));//默认不启用tls加密
		System.out.println(ConfigUtils.get(CommonConstants.CONFIG_LOGIN_URL, "/"));
		System.out.println(ConfigUtils.get("db.pwd", "/"));
	}
}
