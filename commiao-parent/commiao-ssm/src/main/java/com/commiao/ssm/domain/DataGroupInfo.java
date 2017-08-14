package com.commiao.ssm.domain;

import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;

public class DataGroupInfo extends EntitySupport implements Entity{
	private static final long serialVersionUID = 1L;
	
	Long id;
	Long groupId;
	Integer ratioY;
	Integer ratioN;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Integer getRatioY() {
		return ratioY;
	}
	public void setRatioY(Integer ratioY) {
		this.ratioY = ratioY;
	}
	public Integer getRatioN() {
		return ratioN;
	}
	public void setRatioN(Integer ratioN) {
		this.ratioN = ratioN;
	}
}
