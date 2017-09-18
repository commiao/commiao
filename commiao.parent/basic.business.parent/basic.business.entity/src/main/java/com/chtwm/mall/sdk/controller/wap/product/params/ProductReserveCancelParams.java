package com.chtwm.mall.sdk.controller.wap.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年3月4日下午2:43:48 
 * @Description: 取消预约产品 
 * @author:shl
 * @version V1.0   
 */
public class ProductReserveCancelParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -7709124555911421767L;
	//预约订单编号
	private String reserveNo;
	//产品代码
	private String fundCode;
	public String getReserveNo() {
		return reserveNo;
	}
	public void setReserveNo(String reserveNo) {
		this.reserveNo = reserveNo;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
}
