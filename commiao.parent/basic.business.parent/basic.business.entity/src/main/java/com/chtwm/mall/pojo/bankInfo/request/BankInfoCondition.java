package com.chtwm.mall.pojo.bankInfo.request;

import com.chtwm.mall.pojo.bankInfo.BankInfo;

/**
 * 请求参数,请求条件等
 */
public class BankInfoCondition extends BankInfo {

	private static final long serialVersionUID = 8597715764656470415L;

	private int curPage;

	private int pageSize;

	/**
	 * 批量操作多个id
	 */
	private String ids;

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

}