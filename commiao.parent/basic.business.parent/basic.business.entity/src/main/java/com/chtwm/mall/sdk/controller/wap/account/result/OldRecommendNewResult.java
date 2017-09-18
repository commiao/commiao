package com.chtwm.mall.sdk.controller.wap.account.result;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月20日 
 * @Description: 老带新校验出参
 * @author:chenglong
 * @version V1.0   
 */

public class OldRecommendNewResult implements Serializable {
    
    private static final long serialVersionUID = -408584350715483230L;
    
    private String recommendable;   //可以 0  不可以 1
    private String aesEncrypt;      //加密串
    
    public String getRecommendable() {
        return recommendable;
    }
    public void setRecommendable(String recommendable) {
        this.recommendable = recommendable;
    }
    public String getAesEncrypt() {
        return aesEncrypt;
    }
    public void setAesEncrypt(String aesEncrypt) {
        this.aesEncrypt = aesEncrypt;
    }
}
