package com.chtwm.mall.core.util;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;

import basic.arch.component.http.builder.HCB;
import basic.arch.component.http.client.HttpClientUtil;
import basic.arch.component.http.common.HttpConfig;
import com.commiao.basic.business.tools.config.ConfigBean;

import net.sf.json.JSONObject;

class AccessToken implements Serializable{
    private static final long serialVersionUID = 8889537472141402261L;
    private String access_token;
    private Integer expires_in;
    
    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    public Integer getExpires_in() {
        return expires_in;
    }
    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

}

public class WeixinUtil {
    
    /**
     * 
     * 获取access_token
     * 
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public static String getAccessToken() {
        // 第一步获取access_token
        String APPID = ConfigBean.getConfigBean().getPefConfig().getAppId(); // 公众号的唯一标识
        String APPSECRET = ConfigBean.getConfigBean().getPefConfig().getAppSecret();
//        String APPID = "wx25b1ed4cd6ccc8bd"; // 公众号的唯一标识
//        String APPSECRET = "d223811bd4457e3bac1cce64342c4904";
        String getaccess_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+APPID+"&secret="+APPSECRET;
        HCB hcb = HCB.custom().timeout(30000);
        HttpConfig httpConfig =HttpConfig.custom()
                .url(getaccess_token_url)
                .hcb(hcb)
                .encoding("utf-8");
        String response = HttpClientUtil.get(httpConfig); 
        JSONObject jsonObj = JSONObject.fromObject(response);
        String accessToken = jsonObj.getString("access_token");
        return accessToken;
    }

    /**
     * 
     * 获取jsapi_ticket
     * 
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public static String getJsapiTicket(String accessToken) {
        String getticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token="+accessToken+"&type=jsapi";// 接口凭据
        HCB hcb = HCB.custom().timeout(30000);
        HttpConfig httpConfig =HttpConfig.custom()
                .url(getticket_url)
                .hcb(hcb)
                .encoding("utf-8");
        String response = HttpClientUtil.get(httpConfig); 
        JSONObject jsonObj = JSONObject.fromObject(response);
        String errcode = jsonObj.getString("errcode");
        String ticket = null;
        if (errcode.equals("0")) {
            ticket = jsonObj.getString("ticket");
        }
        return ticket;
    }
}
