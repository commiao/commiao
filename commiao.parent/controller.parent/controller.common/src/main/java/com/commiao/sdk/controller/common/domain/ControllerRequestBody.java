package com.commiao.sdk.controller.common.domain;
/**
 * CreateDate:2016年9月22日上午10:00:41 
 * @Description: 请求的json格式 
 * @author:jannal
 * @version V1.0
 * @param <T>
 */
public class ControllerRequestBody<T> extends AbstractControllerBody{
    // 密钥
    private String hmac = "hmac";
    // 请求数据
    private T params;

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

}
