package com.chtwm.mall.sdk.controller.wap.account.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年6月20日 
 * @Description: 老带新返回待加密的bean
 * @author:chenglong
 * @version V1.0   
 */

public class UserIdAndBrokerNo implements Serializable {
    
    private static final long serialVersionUID = -100491239353169639L;

    private String userId;  //客户编号
    
    private String brokerNo;    //理财师编号

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBrokerNo() {
        return brokerNo;
    }

    public void setBrokerNo(String brokerNo) {
        this.brokerNo = brokerNo;
    }
    
}
