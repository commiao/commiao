package com.commiao.basic.business.tools.exception;

import base.arch.component.exception.BusinessServiceException;

/**
 * 方法统一校验异常
 * @author jannal
 */
public class ValidateParamsException  extends BusinessServiceException {

    private static final long serialVersionUID = 1L;
    
    /**
     *  状态码
     */
    private String status ;
    /**
     * 特殊意义的编码
     */
    private String code ;
    /**
     * 消息
     */
    private String msg;
    
    
    
    public ValidateParamsException(String description, String errorCode, Object dataModel, Throwable cause) {
        super(description, errorCode, dataModel, cause);
    }



    public ValidateParamsException(String description, String businessModule, String errorCode, Throwable cause) {
        super(description, businessModule, errorCode, cause);
    }



    public ValidateParamsException(String description, String errorCode, Throwable cause) {
        super(description, errorCode, cause);
    }


    public ValidateParamsException(String status, String code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }
    
    public ValidateParamsException( String msg,String code) {
        super();
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
  /*  @Override
    public synchronized Throwable fillInStackTrace() {
      //return this;
        return null;
    }*/
}
