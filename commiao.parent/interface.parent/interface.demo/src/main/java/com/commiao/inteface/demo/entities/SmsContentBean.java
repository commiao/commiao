package com.commiao.inteface.demo.entities;

import java.io.Serializable;

/** 
 * CreateDate:2016年10月11日下午4:16:48 
 * @Description: 短信模板信息类
 * @author:hehch
 * @version V1.0   
 */
public class SmsContentBean implements Serializable {

	private static final long serialVersionUID = -1197457454906000558L;
	/**
	 * id
	 */
	private String smsId;
	/**
	 * 短信模板类型
	 */
	private String smsType;
	/**
	 * 短信模板内容
	 */
	private String smsContent;
	/**
	 * 短信模板状态
	 */
	private String smsStatus;
	
	/** 
	 * 获取 id 
	 * @return smsId 
	 */
	public String getSmsId() {
		return smsId;
	}
	/** 
	 * 获取 短信模板类型 
	 * @return smsType 
	 */
	public String getSmsType() {
		return smsType;
	}
	/** 
	 * 获取 短信模板内容 
	 * @return smsContent 
	 */
	public String getSmsContent() {
		return smsContent;
	}
	/** 
	 * 获取 短信模板状态 
	 * @return smsStatus 
	 */
	public String getSmsStatus() {
		return smsStatus;
	}
	/**
	 * 设置 id 
	 * @param smsId the smsId to set
	 */
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	/**
	 * 设置 短信模板类型 
	 * @param smsType the smsType to set
	 */
	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}
	/**
	 * 设置 短信模板内容 
	 * @param smsContent the smsContent to set
	 */
	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}
	/**
	 * 设置 短信模板状态 
	 * @param smsStatus the smsStatus to set
	 */
	public void setSmsStatus(String smsStatus) {
		this.smsStatus = smsStatus;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer("短信模板详细信息：[");
		sb.append("ID:").append(smsId);
		sb.append(",短信模板类型:").append(smsType);
		sb.append(",短信模板内容  :").append(smsContent);
		sb.append(",短信模板状态 :").append(smsStatus);
		sb.append("]");
		return sb.toString();
	}
}
