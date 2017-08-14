package com.framework.common.core;

/**
 * @author jingmiao
 *	常量类
 */
public class CommonConstants {
	/**
	 * 系统properties配置路径
	 */
	public static final String PROPERITIES_URL = "config/config.properties";
	/**
	 * 否（false，没有）10000000
	 */
	public static final Integer GLOBLE_NO = Integer.valueOf(10000000);
	/**
	 * 是（true，有）10000001
	 */
	public static final Integer GLOBLE_YES = Integer.valueOf(10000001);
	
	/**
	 * 登录信息保存到Session中的key
	 */
	public static final String SESSION_LOGININFO_KEY = "key_login_info_session";
	/**
	 * 登录的url地址
	 */
	public static final String CONFIG_LOGIN_URL = "login_url.back_login_url";
	/**
	 * 登录的url地址
	 */
	public static final String CONFIG_LOGOUT_URL = "logout_url";
	
	/**
	 * 消息类型：信息
	 */
	public static final String MESSAGE_TYPE_INFORMATION = "information";
	/**
	 * 消息类型：警告
	 */
	public static final String MESSAGE_TYPE_WARNING = "warning";
	/**
	 * 消息类型：问题
	 */
	public static final String MESSAGE_TYPE_QUESTION = "question";
	/**
	 * 消息类型：错误
	 */
	public static final String MESSAGE_TYPE_ERROR = "error";
	
	/**
	 * 消息结果：成功
	 */
	public static final String MESSAGE_RESULT_SUCCESS = "success";
	/**
	 * 消息结果：失败
	 */
	public static final String MESSAGE_RESULT_FAIL = "fail";
}
