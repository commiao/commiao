package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/** 
 * CreateDate:2017年3月4日下午2:43:48 
 * @Description: 取消预约产品 
 * @author:shl
 * @version V1.0   
 */
public class ProductReserveCancelForPcParams implements Serializable {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么). 
	 */
	private static final long serialVersionUID = -7709124555911421767L;
	//预约订单编号
	private String reserve_no;
	//产品代码
	private String product_code;
	
	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getReserve_no() {
		return reserve_no;
	}

	public void setReserve_no(String reserve_no) {
		this.reserve_no = reserve_no;
	}
}
