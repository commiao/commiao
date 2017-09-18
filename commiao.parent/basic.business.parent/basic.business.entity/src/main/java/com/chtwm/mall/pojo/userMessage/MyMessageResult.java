package com.chtwm.mall.pojo.userMessage;

import java.io.Serializable;

/**
 * 我的消息封装bean
msgTitle:"预约活动",//消息主题
msgContent:"…",//消息内容
msgDate:""//消息时间【yyyy-MM-dd hh:mm:ss】

 * Create Author: chenglong
 * CreateDate:2016年9月22日上午10:04:11 
 * @Description: TODO 
 * @version V1.0
 */
public class MyMessageResult implements Serializable{
    private static final long serialVersionUID = 7592231321578100246L;
    
    private String msgTitle;
    private String msgContent;      //消息内容
	private String msgDate;         //消息日期(yyyymmddhhMMss)
    public String getMsgContent() {
        return msgContent;
    }
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }
    public String getMsgDate() {
        return msgDate;
    }
    public void setMsgDate(String msgDate) {
        this.msgDate = msgDate;
    }
    public String getMsgTitle() {
        return msgTitle;
    }
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }
	
}
