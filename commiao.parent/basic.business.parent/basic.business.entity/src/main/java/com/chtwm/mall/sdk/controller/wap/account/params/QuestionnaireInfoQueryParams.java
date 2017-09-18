package com.chtwm.mall.sdk.controller.wap.account.params;

/**
 * 查询问题信息
 * @author lumiseven
 *
 */
/*
 * 参数为问卷名称
{
    hmac:"", //预留的加密信息
    params:{//请求的参数信息
		is_risk:"",		//是否风险测评
		paper_id:"",	//问卷编号
		paper_name:""	//问卷名称
    }
}
 */
public class QuestionnaireInfoQueryParams {

	private String is_risk;
	
	private String paper_id;
	
	private String paper_name;

	public String getIs_risk() {
		return is_risk;
	}

	public void setIs_risk(String is_risk) {
		this.is_risk = is_risk;
	}

	public String getPaper_id() {
		return paper_id;
	}

	public void setPaper_id(String paper_id) {
		this.paper_id = paper_id;
	}

	public String getPaper_name() {
		return paper_name;
	}

	public void setPaper_name(String paper_name) {
		this.paper_name = paper_name;
	}
	
}
