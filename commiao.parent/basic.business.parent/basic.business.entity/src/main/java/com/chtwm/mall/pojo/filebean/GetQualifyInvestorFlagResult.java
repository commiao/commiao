package com.chtwm.mall.pojo.filebean;

import java.io.Serializable;

public class GetQualifyInvestorFlagResult implements Serializable {

	private static final long serialVersionUID = -6815297616063310267L;

	private String c_flag; // C1 是否合格投资者【0：否 1：是】 N

	public String getC_flag() {
		return c_flag;
	}

	public void setC_flag(String c_flag) {
		this.c_flag = c_flag;
	}

}
