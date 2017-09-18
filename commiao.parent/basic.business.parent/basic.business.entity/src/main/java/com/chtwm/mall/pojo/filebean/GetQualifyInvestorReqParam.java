/**
 * @file GetQualifyInvestorReqParam.java
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
 * @brief 查询合格投资者认定申请信息请求bean
 *
 * 查询合格投资者认定申请信息请求bean
 * 
 * @author
 *    - 2016年6月17日  申贺龙  创建初始版本
 *
 */
public class GetQualifyInvestorReqParam implements Serializable {
	
	private static final long serialVersionUID = -2351228496436822028L;
	private Integer p_currpage; // N5 当前页 Y 1
	private Integer p_pagerow; // N5 每页记录数 Y 20
	private Integer p_serialno; // "序列号 【序列号和客户编号至少有一个不为空】" N
	private String p_custno; // C12 "客户编号 【序列号和客户编号至少有一个不为空】" N
	private String p_status; // C8 预约状态【FUNDCRM3014字典】 N
	public Integer getP_currpage() {
		return p_currpage;
	}
	public Integer getP_pagerow() {
		return p_pagerow;
	}
	public Integer getP_serialno() {
		return p_serialno;
	}
	public String getP_custno() {
		return p_custno;
	}
	public String getP_status() {
		return p_status;
	}
	public void setP_currpage(Integer p_currpage) {
		this.p_currpage = p_currpage;
	}
	public void setP_pagerow(Integer p_pagerow) {
		this.p_pagerow = p_pagerow;
	}
	public void setP_serialno(Integer p_serialno) {
		this.p_serialno = p_serialno;
	}
	public void setP_custno(String p_custno) {
		this.p_custno = p_custno;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
}
