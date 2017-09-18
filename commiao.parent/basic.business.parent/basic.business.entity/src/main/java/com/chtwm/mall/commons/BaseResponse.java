package com.chtwm.mall.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 * @author xuliang
 */
public class BaseResponse<T> {
	
    private String message;
    private String code;
    private String login_total;//累计登录次数
    private String last_login;//上一次登录时间
    private String password;//查询密码
    private String reserve;//保留字段
    private String reserve2;//保留字段
    private String pass_flag;
    private String modify_result;//密码修改结果
	private String total_count;//:"",//总记录数
	private String total_page;//:"",//总页数
	private String     hmac;//:"", //预留字段
	private String     msg;//: "success",
	private String     status;//: "0"
    private String return_password;//注册客户加密密码
    private String return_client_id;//注册客户编号
    private String cust_no;//注册用户转正
    private String grade;//评分等级
    private String option_score;//得分
    //小额理财
    private String Errcode;
    private String Errmsg;
    private String Salt;
    private String pageSize;
    private String pageNo;
    private String totalNum;
    private String fact_cust_no;//事实客户号
    private String total;
    public String getTotal() {
		return total;
	}

	public String getModify_result() {
		return modify_result;
	}

	public void setModify_result(String modify_result) {
		this.modify_result = modify_result;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	//result结果集
	private List<T> results;
	//list结果集
	private List<T> list;
    
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public String getErrcode() {
		return Errcode;
	}

	public void setErrcode(String errcode) {
		Errcode = errcode;
	}
	
	public String getErrmsg() {
		return Errmsg;
	}

	public void setErrmsg(String errmsg) {
		Errmsg = errmsg;
	}

	public String getSalt() {
		return Salt;
	}
	public void setSalt(String salt) {
		Salt = salt;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String getCust_no() {
		return cust_no;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getOption_score() {
		return option_score;
	}
	public void setOption_score(String option_score) {
		this.option_score = option_score;
	}
	public String getPass_flag() {
		return pass_flag;
	}
	public void setPass_flag(String pass_flag) {
		this.pass_flag = pass_flag;
	}
	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}
	public String getReturn_password() {
		return return_password;
	}
	public void setReturn_password(String return_password) {
		this.return_password = return_password;
	}
	public String getReturn_client_id() {
		return return_client_id;
	}
	public void setReturn_client_id(String return_client_id) {
		this.return_client_id = return_client_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLogin_total() {
		return login_total;
	}
	public void setLogin_total(String login_total) {
		this.login_total = login_total;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getTotal_count() {
		return total_count;
	}
	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}

	public String getTotal_page() {
		return total_page;
	}
	public void setTotal_page(String total_page) {
		this.total_page = total_page;
	}

	public String getHmac() {
		return hmac;
	}

	public void setHmac(String hmac) {
		this.hmac = hmac;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<T> getResults() {
		if(this.results==null){
			results = new ArrayList<T>();
		}
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	public String getFact_cust_no() {
		return fact_cust_no;
	}

	public void setFact_cust_no(String fact_cust_no) {
		this.fact_cust_no = fact_cust_no;
	}
}
