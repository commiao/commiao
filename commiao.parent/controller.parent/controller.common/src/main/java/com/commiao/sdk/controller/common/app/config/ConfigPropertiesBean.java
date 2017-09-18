package com.commiao.sdk.controller.common.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
/**
 * CreateDate:2016年11月11日下午3:35:02 
 * @Description: app属性配置类
 * @author:jannal
 * @version V1.0
 */
@Controller("configPropertiesBean")
public class ConfigPropertiesBean {

    @Value("${excludePath}")
    private String excludePath;

    public String getExcludePath() {
        return excludePath;
    }

    public void setExcludePath(String excludePath) {
        this.excludePath = excludePath;
    }
    
    
    
}
