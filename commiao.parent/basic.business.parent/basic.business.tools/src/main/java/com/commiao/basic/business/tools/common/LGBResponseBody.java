package com.commiao.basic.business.tools.common;

import java.io.Serializable;


/**
 * 响应的数据
 * @author chenglong
 */
public class LGBResponseBody implements Serializable {
    
    private static final long serialVersionUID = -3728267310101090956L;
    // 状态码
    private String status = "9999";
    // 消息
    private String message;
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "LGBResponseBody [status=" + status + ", message=" + message + "]";
    }
    
}
