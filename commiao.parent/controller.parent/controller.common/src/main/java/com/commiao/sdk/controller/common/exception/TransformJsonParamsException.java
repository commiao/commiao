package com.commiao.sdk.controller.common.exception;

import com.commiao.basic.business.tools.exception.ValidateParamsException;

/**
 * json转换异常
 * 
 * @author jannal
 */
public class TransformJsonParamsException extends ValidateParamsException {
    private static final long serialVersionUID = -4759835509045377467L;

    public TransformJsonParamsException(String status, String code, String msg) {
        super(status, code, msg);
    }

}
