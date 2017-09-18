/**
 * @file GetQualifyInvestorFlagParam.java
 * @brief 文件简要说明
 *
 * 文件详细说明
 *
 * @author
 *    - 2016年6月17日  申贺龙  创建初始版本
 *
 * @version
 *    - 2016年6月17日  V1.0  简要版本说明
 *
 * @par 版权信息：
 * 		2016 Copyright 恒添宝 All Rights Reserved.
 */
package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

/**
 * @brief 查询是否为合格投资者请求bean
 *
 * 查询是否为合格投资者请求bean
 * 
 * @author
 *    - 2016年6月17日  申贺龙  创建初始版本
 *
 */
public class GetQualifyInvestorFlagParam implements Serializable {
	private static final long serialVersionUID = -3881400582876867485L;
	private String p_custno; // C12 客户编号 Y
	private Double p_reservebalance; // N16.2 预约金额 Y
	public String getP_custno() {
		return p_custno;
	}
	public Double getP_reservebalance() {
		return p_reservebalance;
	}
	public void setP_custno(String p_custno) {
		this.p_custno = p_custno;
	}
	public void setP_reservebalance(Double p_reservebalance) {
		this.p_reservebalance = p_reservebalance;
	}
}
