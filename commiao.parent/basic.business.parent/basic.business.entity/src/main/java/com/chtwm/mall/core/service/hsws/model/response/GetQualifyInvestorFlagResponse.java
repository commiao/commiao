package com.chtwm.mall.core.service.hsws.model.response;

import java.io.Serializable;

/**
 * 查询是否为合格投资者(CRM)(D136) 接口响应实体类泛型类
 * @author Administrator
 *
 */
public class GetQualifyInvestorFlagResponse implements Serializable {

	private static final long serialVersionUID = -6815297616063310267L;

	private String c_flag; // C1 是否合格投资者【0：否 1：是】 N

	public String getC_flag() {
		return c_flag;
	}

	public void setC_flag(String c_flag) {
		this.c_flag = c_flag;
	}

}
