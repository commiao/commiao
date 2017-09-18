package com.chtwm.mall.pojo.wx;

import com.chtwm.mall.pojo.UserInfo;

/**
 * 
 * @brief redis中存储绑定后的微信（openId）与金服用户（clientId）结合json
 *
 * 类详细说明
 * 
 * @author
 *    - 2016年12月20日  程珑  创建初始版本
 *
 */
public class WeChatId{
    private String openId;   //微信id
    private String clientId; //多金与SalesForce通用Id
    private UserInfo userInfo; //用户信息缓存

    public WeChatId() {
        super();
    }
    public WeChatId(String openId, String clientId) {
        super();
        this.openId = openId;
        this.clientId = clientId;
    }
    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public UserInfo getUserInfo() {
        return userInfo;
    }
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
