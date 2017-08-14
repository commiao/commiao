package com.commiao.domain.constants;

/**
 * @author jingmiao
 *
 */
public interface UserConstants {
	/**
	 * 新注册 20000000
	 */
	Integer USER_STATUS_NEW = Integer.valueOf(20000000);
	/**
	 * 正常 20000001
	 */
	Integer USER_STATUS_NORMAL = Integer.valueOf(20000001);
	/**
	 * 禁用 20000002
	 */
	Integer USER_STATUS_NO = Integer.valueOf(20000002);
	/**
	 * 【新注册 20000000】【正常 20000001】【禁用 20000002】
	 */
	Integer[] USER_STATUS = {USER_STATUS_NEW,USER_STATUS_NORMAL,USER_STATUS_NO};
}
