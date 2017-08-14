package com.commiao.domain.constants;

/**
 * @author jingmiao
 *
 */
public interface Constants {
	/**
	 * 否（false，没有）10000000
	 */
	Integer GLOBLE_NO = Integer.valueOf(10000000);
	/**
	 * 是（true，有）10000001
	 */
	Integer GLOBLE_YES = Integer.valueOf(10000001);
	/**
	 * 否（false，没有）10000000 或者 是（true，有）10000001
	 */
	Integer[] GLOBLE_YES_OR_NO = {GLOBLE_NO,GLOBLE_YES};
	
	/**
	 * 向第三方发送请求地址（生产环境）10001000
	 */
	String POST_PAY_URL_TYPE_PRODUCTION = String.valueOf(10001000);
	/**
	 * 向第三方发送请求地址（测试环境）10001001
	 */
	String POST_PAY_URL_TYPE_TEST = String.valueOf(10001001);
	/**
	 * 向第三方发送请求地址（本地开发）10001002
	 */
	String POST_PAY_URL_TYPE_LOCALHOST = String.valueOf(10001002);
	/**
	 * 后台访问地址 http://192.168.0.1:8080
	 */
}
