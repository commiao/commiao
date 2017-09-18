package com.commiao.basic.business.tools.exception;

import org.apache.commons.lang.StringUtils;

/**
 * @description 金服日志映射恒生错误日志
 * @version V1.0 
 * @author heshiyuan 
 * @date Jun 26, 2017 2:53:45 PM 
 * @email shiyuan4work@sina.com
 * @github https://github.com/shiyuan2he.git
 * Copyright (c) 2016 shiyuan4work@sina.com All rights reserved
 */
public class JfInterfaceException extends PofInterfaceException {


	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = 1L;
	private static String POF_INTERFACE_ERRORCODE_PREFIX = "JF";
	/**
	 * 特殊意义的编码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;

	public JfInterfaceException(String code, String msg, Throwable cause) {
		super(cause);
		this.code = code;
		this.msg = msg;
	}

	public JfInterfaceException(String msg, Throwable cause) {
		super(cause);
		this.msg = msg;
	}

	public JfInterfaceException(String code, String msg) {
		super(code,msg);
		this.code = code;
		this.msg = msg;
	}

	public JfInterfaceException(Throwable cause) {
		super(cause);
	}

	public JfInterfaceException(String msg) {
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
