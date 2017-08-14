package com.framework.common.core.spring.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationVar {
	private static ApplicationVar instance;
	private static ClassPathXmlApplicationContext ctx;

	public static ApplicationVar getInstance() {
		if (instance == null) {
			 ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-vars.xml");
			instance = ctx.getBean(ApplicationVar.class);
		}
		return instance;
	}
	
	/**
	 * web服务器IP
	 */
	@Value("${website.ip:42.96.198.1}")
	public String website_ip;
	/**
	 * 代码生成：数据库驱动
	 */
	@Value("${generator.db.driver:com.mysql.jdbc.Driver}")
	public String generator_db_driver;
	/**
	 * 代码生成：数据库地址
	 */
	@Value("${generator.db.url:jdbc:mysql://localhost:3306/commiao?useUnicode=true&amp;characterEncoding=UTF-8}")
	public String generator_db_url;
	/**
	 * 代码生成：数据库用户
	 */
	@Value("${generator.db.user:root}")
	public String generator_db_user;
	/**
	 * 代码生成：数据库密码
	 */
	@Value("${generator.db.pwd:miaojing}")
	public String generator_db_pwd;
}
