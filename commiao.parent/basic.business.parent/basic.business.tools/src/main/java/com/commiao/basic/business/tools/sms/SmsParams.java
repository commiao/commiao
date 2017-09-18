package com.commiao.basic.business.tools.sms;

import java.util.HashMap;
import java.util.Map;

public class SmsParams {
    /***
     * 手机号码
     */
    private String  phoneNum;
    
    /**
     * 短信内容
     */
    
    private String content;
    
    /**
     * 应用场景
     */
    private String scenarios;
    /**
     * 是否是语音短信
     * 
     */
    private boolean voiceSmsCode=false;
    

    public boolean isVoiceSmsCode() {
        return voiceSmsCode;
    }

    public void setVoiceSmsCode(boolean voiceSmsCode) {
        this.voiceSmsCode = voiceSmsCode;
    }
    /**
     * 短信中的参数
     */
    private Map<String, Object> parameters = new HashMap<String, Object>();
    
    /**
     * 是否是短信验证码码
     */
    private boolean flagCode=false;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getScenarios() {
        return scenarios;
    }
    

    public void setScenarios(String scenarios) {
        this.scenarios = scenarios;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public boolean getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(boolean flagCode) {
        this.flagCode = flagCode;
    }
    public void addParameter(String key,Object value){
    	parameters.put(key, value);
    }
}
