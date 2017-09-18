package com.commiao.sdk.controller.common.domain;

import java.util.List;

import com.commiao.basic.business.tools.common.constant.GlobalResultCode;


/**
 * CreateDate:2016年9月22日上午10:01:44 
 * @Description:响应的数据 
 * @author:jannal
 * @version V1.0
 */
public class ControllerResponseBody<T> extends AbstractControllerBody{
    public final static  String SUCCESS_MSG = "success";
    public final static String SUCCESS = "0";// 成功
    public final static String FAILED = "1";// 失败
    
    private String hmac="hmac";
    private String status = SUCCESS;
    private String code;
    private String msg=SUCCESS_MSG;
    private T data ;
    public ControllerResponseBody() {
    }
    
    
    public ControllerResponseBody(String status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }
    public ControllerResponseBody(String status, String msg,String code) {
        super();
        this.status = status;
        this.msg = msg;
        this.code=code;
    }
    
    public ControllerResponseBody(String status,String msg,String code, T data) {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ControllerResponseBody(String status,String msg,String code, List<T> data) {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
    }
    
    public static ControllerResponseBody<Object> defaultFail(){
        return new ControllerResponseBody<Object>(ControllerResponseBody.FAILED,"操作失败",GlobalResultCode.CommonResultCode.OPERATION_FAILED);
    } 
    
    public static ControllerResponseBody<Object> defaultSuccess(){
        return new ControllerResponseBody<Object>(ControllerResponseBody.SUCCESS,ControllerResponseBody.SUCCESS_MSG,GlobalResultCode.CommonResultCode.OPERATION_SUCCESS);
    }

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
