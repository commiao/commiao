package com.chtwm.mall.core.service.hsws.model.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 响应实体类主类
 * @author Administrator
 *
 * @param <T>
 */
public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 5880197101451007115L;

	private String p_reasoncode; // C4 "返回码 0000-成功 8888-无权限访问 9999-系统异常 其他返回码为逻辑性提示" Y
	private String p_reasoninfo; // C100 返回信息 N
	private Integer p_totalpage; // N5 总页数 Y
	private Integer p_totalcount; // N5 总记录数 Y

	private List<T> p_result = new ArrayList<T>(); // 返回结果集

	public String getP_reasoncode() {
		return p_reasoncode;
	}

	public void setP_reasoncode(String p_reasoncode) {
		this.p_reasoncode = p_reasoncode;
	}

	public String getP_reasoninfo() {
		return p_reasoninfo;
	}

	public void setP_reasoninfo(String p_reasoninfo) {
		this.p_reasoninfo = p_reasoninfo;
	}

	public Integer getP_totalpage() {
		return p_totalpage;
	}

	public void setP_totalpage(Integer p_totalpage) {
		this.p_totalpage = p_totalpage;
	}

	public Integer getP_totalcount() {
		return p_totalcount;
	}

	public void setP_totalcount(Integer p_totalcount) {
		this.p_totalcount = p_totalcount;
	}

	public List<T> getP_result() {
		return p_result;
	}

	public void setP_result(List<T> p_result) {
		this.p_result = p_result;
	}

}
