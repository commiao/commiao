package com.chtwm.mall.sdk.controller.wap.account.params;

public class CustDetailAssetQueryParams {
	private String end_date;
	//当前页数
	private String page_no;
	//每页记录数
	private String page_size;

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getPage_no() {
		return page_no;
	}

	public String getPage_size() {
		return page_size;
	}

	public void setPage_no(String page_no) {
		this.page_no = page_no;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}
	
}
