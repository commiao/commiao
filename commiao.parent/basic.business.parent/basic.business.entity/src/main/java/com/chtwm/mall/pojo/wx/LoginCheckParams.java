package com.chtwm.mall.pojo.wx;

public class LoginCheckParams {

	private String username;   //账号
	
	private String password;   //密码
	
	private String custType;  //客户类型
	
	private String openId;   //微信openId

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }
	
}
