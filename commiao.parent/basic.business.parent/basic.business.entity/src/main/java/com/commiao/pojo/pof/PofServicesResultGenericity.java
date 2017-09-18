package com.commiao.pojo.pof;

import java.io.Serializable;

/**
 * CreateDate:2016年10月11日上午10:51:26
 * 
 * @Description: 返回数据泛型类父类
 * @author:hehch
 * @version V1.0
 */
public class PofServicesResultGenericity implements Serializable {

	private static final long serialVersionUID = -1826094332757934374L;

	/**
	 * 总记录数
	 */
	private Integer totalCount = 0;

	/** 
	 * 获取 总记录数 
	 * @return totalCount 
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * 设置 总记录数 
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
