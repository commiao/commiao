package com.chtwm.mall.pojo;

import java.util.Date;

import com.commiao.basic.business.tools.common.DateUtils;


public class VerifyCode {
	
	private String id; 
	private String code; 
	private String code_time; 
	private Date codeTime; 
	private String type; 
	private String account; 
	private String memo;
	private String email;
	private String minus;
	private String cust_no;
	
	
	
	public Date getCodeTime() {
        return codeTime;
    }
    public void setCodeTime(Date codeTime) {
        this.codeTime = codeTime;
    }
    public String getCodeTimeString() {
        return DateUtils.formatDateToString(getCodeTime(), "yyyy-MM-dd HH:mm:ss");
      }
      public void setCodeTimeString(String codeTime) {
          setCodeTime(DateUtils.parse(codeTime, "yyyy-MM-dd HH:mm:ss"));
      }
      
    public String getCust_no() {
		return cust_no;
	}
	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}
	public String getMinus() {
		return minus;
	}
	public void setMinus(String minus) {
		this.minus = minus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_time() {
		return code_time;
	}
	public void setCode_time(String code_time) {
		this.code_time = code_time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	} 
	
	
	
	
	
	

}
