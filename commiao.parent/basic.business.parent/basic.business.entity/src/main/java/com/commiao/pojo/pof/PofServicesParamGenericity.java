package com.commiao.pojo.pof;

import java.io.Serializable;

/**
 * CreateDate:2016年10月11日上午10:51:26
 * 
 * @Description: 传入参数泛型类父类
 * @author:hehch
 * @version V1.0
 */
public class PofServicesParamGenericity implements Serializable {

	private static final long serialVersionUID = -6464106174645431210L;
	/**
	 * 分页查询--当前查询页码
	 */
	private Integer pageCurrent;
	/**
	 * 分页查询--每页数据量
	 */
	private Integer pageSize;
	/**
	 * 用户信息
	 */
	private AcctCustBean acctInfo;
	/**
	 * 图文验证码
	 */
	private String imageCode;

	/**
	 * 获取 分页查询--当前查询页码
	 * 
	 * @return pageCurrent
	 */
	public Integer getPageCurrent() {
		return pageCurrent;
	}

	/**
	 * 获取 分页查询--每页数据量
	 * 
	 * @return pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * 获取 用户信息
	 * 
	 * @return acctInfo
	 */
	public AcctCustBean getAcctInfo() {
		return acctInfo;
	}

	/**
	 * 获取 图文验证码
	 * 
	 * @return imageCode
	 */
	public String getImageCode() {
		return imageCode;
	}

	/**
	 * 设置 分页查询--当前查询页码
	 * 
	 * @param pageCurrent
	 *            the pageCurrent to set
	 */
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	/**
	 * 设置 分页查询--每页数据量
	 * 
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 设置 用户信息
	 * 
	 * @param acctInfo
	 *            the acctInfo to set
	 */
	public void setAcctInfo(AcctCustBean acctInfo) {
		this.acctInfo = acctInfo;
	}

	/**
	 * 设置 图文验证码
	 * 
	 * @param imageCode
	 *            the imageCode to set
	 */
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}

}
