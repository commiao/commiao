package com.chtwm.mall.pojo.identityAuth;

import java.io.Serializable;

/** 
 * CreateDate:2016年11月22日下午3:51:13 
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author:wrx
 * @version V1.0   
 */
public class QueryPayIdentityResult implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -2292296632041939573L;
	private String serialNo;//流水号
	private String protocolNo;//协议号
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getProtocolNo() {
        return protocolNo;
    }
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }
	
}
