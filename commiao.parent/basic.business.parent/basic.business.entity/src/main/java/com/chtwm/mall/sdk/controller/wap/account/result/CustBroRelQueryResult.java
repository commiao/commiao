package com.chtwm.mall.sdk.controller.wap.account.result;

/**
 * 
 * @author lumiseven
 *
 */
/*
 * 
{
    data: [
        {
         broker_account:””,//员工号
         broker_name:””,//员工姓名
         cust_no:””,//客户编号
         relation_type:””,//关系类别
         mobile_tel:””,//手机号
         dpt_name:””//员工部门
		},
		{}…
    ], 
    hmac:"", //预留字段
    msg: "success",
    status: "0"
}
 */
public class CustBroRelQueryResult {

	private String broker_account;
	
	private String broker_name;
	
	private String cust_no;
	
	private String relation_type;
	
	private String mobile_tel;
	
	private String dpt_name;
	
	private String is_main;
	
	private String career_status;
	
	private String address;
	
	
	

	public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCareer_status() {
        return career_status;
    }

    public void setCareer_status(String career_status) {
        this.career_status = career_status;
    }

    public String getIs_main() {
		return is_main;
	}

	public void setIs_main(String is_main) {
		this.is_main = is_main;
	}

	public String getBroker_account() {
		return broker_account;
	}

	public void setBroker_account(String broker_account) {
		this.broker_account = broker_account;
	}

	public String getBroker_name() {
		return broker_name;
	}

	public void setBroker_name(String broker_name) {
		this.broker_name = broker_name;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getRelation_type() {
		return relation_type;
	}

	public void setRelation_type(String relation_type) {
		this.relation_type = relation_type;
	}

	public String getMobile_tel() {
		return mobile_tel;
	}

	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}

	public String getDpt_name() {
		return dpt_name;
	}

	public void setDpt_name(String dpt_name) {
		this.dpt_name = dpt_name;
	}
	
}
