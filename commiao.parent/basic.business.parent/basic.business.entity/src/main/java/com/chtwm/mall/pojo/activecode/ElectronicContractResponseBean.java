/**
 * @file ElectronicContractResponseBean.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年8月8日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年8月8日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.activecode;

import java.io.Serializable;

/**
 * @brief 电子合同响应bean
 *
 * 电子合同响应bean
 * 
 * @author
 *    - 2016年8月8日  申贺龙  创建初始版本
 *
 */
public class ElectronicContractResponseBean implements Serializable {

	private static final long serialVersionUID = 1374634190153674305L;
	//响应代码
	private String respcode;
	//响应信息
	private String respmsg;
	//接口处理成功
	private boolean signFlag;
	//激活码
	private String activeCode;
	public String getRespcode() {
		return respcode;
	}
	public String getRespmsg() {
		return respmsg;
	}
	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}
	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public boolean isSignFlag() {
		return signFlag;
	}
	public void setSignFlag(boolean signFlag) {
		this.signFlag = signFlag;
	}
	
}
