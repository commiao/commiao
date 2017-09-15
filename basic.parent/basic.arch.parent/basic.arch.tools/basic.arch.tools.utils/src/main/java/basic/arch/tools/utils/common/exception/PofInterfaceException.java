package basic.arch.tools.utils.common.exception;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * CreateDate:2016年9月21日下午3:56:16
 * 
 * @Description: 公募接口异常类
 * @author:yuzhao
 * @version V1.0
 */
public class PofInterfaceException extends RuntimeException {

	private static final long serialVersionUID = -6169711830886112852L;

	private static String POF_INTERFACE_ERRORCODE_PREFIX = "POF";
	/**
	 * 特殊意义的编码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;

	public PofInterfaceException(String code, String msg, Throwable cause) {
		super(cause);
		this.code = code;
		this.msg = msg;
	}

	public PofInterfaceException(String msg, Throwable cause) {
		super(cause);
		this.msg = msg;
	}

	public PofInterfaceException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public PofInterfaceException(Throwable cause) {
		super(cause);
	}

	public PofInterfaceException(String msg) {
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

	/** 
	 */  
	@Override
	public synchronized Throwable fillInStackTrace() {
			return null;
	}

	/** 
	 */  
	@Override
	public synchronized Throwable getCause() {
		return null;
	}
	
	
}
