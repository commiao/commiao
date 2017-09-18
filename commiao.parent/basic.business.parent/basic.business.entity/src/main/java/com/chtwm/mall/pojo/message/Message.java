package com.chtwm.mall.pojo.message;

import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;


public class Message {
	
	private int id;//主键
	private String  phone;//手机号
    private String content;//内容
    private Date sendTime;//发送时间
    private String status;//状态
//    private int retryTime;//
//	private int version;//版本
    private String channel;
    private String resultMsg;//后台管理消息返回消息
    private String resultCode;//返回状态
    private String resultContent;//短信运行商返回内容
//    private String scenarios;//应用场景
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	
	public String getSendTimeString() {
	  return DateUtils.formatDateToString(getSendTime(), "yyyy-MM-dd");
	}
	public void setSendTimeString(String sendTime) {
		setSendTime(DateUtils.parse(sendTime, "yyyy-MM-dd"));
	}
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatusShow(String status) {
		this.status = status;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultContent() {
		return resultContent;
	}
	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public void setStatus(String status) {
		this.status = status;
	}
//	public int getRetryTime() {
//		return retryTime;
//	}
//	public void setRetryTime(int retryTime) {
//		this.retryTime = retryTime;
//	}
//	public int getVersion() {
//		return version;
//	}
//	public void setVersion(int version) {
//		this.version = version;
//	}
//	public String getScenarios() {
//		return scenarios;
//	}
//	public void setScenarios(String scenarios) {
//		this.scenarios = scenarios;
//	}
    
	
}
