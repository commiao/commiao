package com.chtwm.mall.core.service.hsws.model.request;

import java.io.Serializable;

/**
 * 请求参数实体类父类
 * @author Administrator
 *
 */
public class BaseRequest implements Serializable {

	private static final long serialVersionUID = -6657540247665965665L;

	private Integer p_currpage; // N5 当前页 Y 1
	private Integer p_pagerow; // N5 每页记录数 Y 20

	public Integer getP_currpage() {
		return p_currpage;
	}

	public void setP_currpage(Integer p_currpage) {
		this.p_currpage = p_currpage;
	}

	public Integer getP_pagerow() {
		return p_pagerow;
	}

	public void setP_pagerow(Integer p_pagerow) {
		this.p_pagerow = p_pagerow;
	}

}
