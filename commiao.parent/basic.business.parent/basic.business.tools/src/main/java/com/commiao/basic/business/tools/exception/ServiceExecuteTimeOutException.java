package com.commiao.basic.business.tools.exception;

import basic.arch.component.exception.BusinessServiceException;

/**
 * CreateDate:2016年11月14日上午10:42:07
 * 
 * @Description: 任务超时异常
 * @author:hehch
 * @version V1.0
 */
public class ServiceExecuteTimeOutException extends BusinessServiceException {

	private static final long serialVersionUID = 1L;

	/**
	 * 状态码
	 */
	private String status;
	/**
	 * 特殊意义的编码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;

	public ServiceExecuteTimeOutException(String description, String errorCode, Object dataModel, Throwable cause) {
        super(description, errorCode, dataModel, cause);
    }

	public ServiceExecuteTimeOutException(String description, String businessModule, String errorCode, Throwable cause) {
        super(description, businessModule, errorCode, cause);
    }

	public ServiceExecuteTimeOutException(String description, String errorCode, Throwable cause) {
        super(description, errorCode, cause);
    }

	public ServiceExecuteTimeOutException(String status, String code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
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

	/**
	 * 防止栈拷贝,防止性能问题
	 */
	/*
	 * @Override public synchronized Throwable fillInStackTrace() { //return
	 * this; return null; }
	 */
}
