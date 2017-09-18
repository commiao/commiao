package com.chtwm.mall.pojo.controller.pc.product.params;

import java.io.Serializable;

/**
 * 
 * CreateDate:2017年3月4日下午2:31:06 
 * @Description: 产品预约请求参数 
 * @author:shl
 * @version V1.0
 */
public class ProductReserveParamsForPc implements Serializable {

    /**
	 * serialVersionUID:序列化 
	 */
	private static final long serialVersionUID = -4168417249032936326L;

private String product_code;
	
	private String appoint_money;
	
	private String broker_account;
	
	private String project_name;
	
	private String project_code;
	
	private String isAllowAppend;//是否可追加，用于防止重复预约
	
	public String getIsAllowAppend() {
        return isAllowAppend;
    }

    public void setIsAllowAppend(String isAllowAppend) {
        this.isAllowAppend = isAllowAppend;
    }
	
	public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getAppoint_money() {
		return appoint_money;
	}

	public void setAppoint_money(String appoint_money) {
		this.appoint_money = appoint_money;
	}

	public String getBroker_account() {
		return broker_account;
	}

	public void setBroker_account(String broker_account) {
		this.broker_account = broker_account;
	}
}
