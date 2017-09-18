package com.commiao.basic.business.tools.common.constant;

/**
 * 
 * CreateDate:2016年9月29日上午12:10:18 
 * @Description: 参数转换自定义异常类
 * @author:yuzhao
 * @version V1.0
 */
public class ParamConvertException extends RuntimeException {

	private static final long serialVersionUID = 8268598501364187627L;

	public ParamConvertException() {
        super();
    }

    public ParamConvertException(String message) {
        super(message);
    }

    public ParamConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParamConvertException(Throwable cause) {
        super(cause);
    }
}
