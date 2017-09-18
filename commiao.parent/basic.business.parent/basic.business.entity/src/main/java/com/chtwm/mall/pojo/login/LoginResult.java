package com.chtwm.mall.pojo.login;

import java.io.Serializable;

public class LoginResult implements Serializable{
    
    private static final long serialVersionUID = 1375997785283912033L;
    
    private String isLogin;     // "1"//是否登录状态【1.登录;2.未登录】
    private String maskName;    // "张三"//用户名
    
    public String getIsLogin() {
        return isLogin;
    }
    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    }
    public String getMaskName() {
        return maskName;
    }
    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }
    
}
