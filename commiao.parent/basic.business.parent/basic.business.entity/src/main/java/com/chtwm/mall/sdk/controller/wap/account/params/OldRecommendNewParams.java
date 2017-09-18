package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月20日 
 * @Description: 老带新校验入参 
 * @author:chenglong
 * @version V1.0   
 */

public class OldRecommendNewParams implements Serializable{

    private static final long serialVersionUID = -5558131230248864373L;
    private String brokerAccount;//理财师工号

    public String getBrokerAccount() {
        return brokerAccount;
    }

    public void setBrokerAccount(String brokerAccount) {
        this.brokerAccount = brokerAccount;
    }
    
}
