package com.commiao.basic.business.tools.exception;

import org.apache.commons.lang.StringUtils;

/**
 * @description <p>恒生错误代码</p>
 * @param
 * @author heshiyuan 
 * @date Jun 28, 2017 2:02:31 PM 
 * @email shiyuan4work@sina.com
 * @github https://github.com/shiyuan2he.git
 * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
 */
public class HsInterfaceException extends RuntimeException {

	private static final long serialVersionUID = 8697649909241391892L;
	
	private static String POF_INTERFACE_ERRORCODE_PREFIX = "HS";
	/**
	 * 特殊意义的编码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;

	public HsInterfaceException(String code, String msg, Throwable cause) {
		super(cause);
		this.code = code;
		this.msg = msg;
	}

	public HsInterfaceException(String msg, Throwable cause) {
		super(cause);
		this.msg = msg;
	}

	public HsInterfaceException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public HsInterfaceException(Throwable cause) {
		super(cause);
	}

	public HsInterfaceException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getCode() {
		if (StringUtils.isBlank(code)) {
			return "";
		} else {
			return POF_INTERFACE_ERRORCODE_PREFIX + code;
		}
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
