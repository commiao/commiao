package com.commiao.basic.business.tools.exception;

/**
 * 
 * CreateDate:2016年9月21日下午3:56:16
 * 
 * @Description: 公募服务异常类
 * @author:yuzhao
 * @version V1.0
 */
public class PofServiceException extends RuntimeException {

	private static final long serialVersionUID = -3635519920628554964L;
	/**
	 * 特殊意义的编码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;

	public PofServiceException(String code, String msg, Throwable cause) {
		super(cause);
		this.code = code;
		this.msg = msg;
	}

	public PofServiceException(String msg, Throwable cause) {
		super(cause);
		this.msg = msg;
	}

	public PofServiceException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public PofServiceException(Throwable cause) {
		super(cause);
	}

	public PofServiceException(String msg) {
		this.msg = msg;
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
}
