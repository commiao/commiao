package com.commiao.ssm.domain;

import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;

public class DataGroup extends EntitySupport implements Entity{
	private static final long serialVersionUID = 1L;
	
	Long id;
	Long columnId;
	Integer countData;
	Integer countDataY;
	Integer countDataN;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getColumnId() {
		return columnId;
	}
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}
	public Integer getCountData() {
		return countData;
	}
	public void setCountData(Integer countData) {
		this.countData = countData;
	}
	public Integer getCountDataY() {
		return countDataY;
	}
	public void setCountDataY(Integer countDataY) {
		this.countDataY = countDataY;
	}
	public Integer getCountDataN() {
		return countDataN;
	}
	public void setCountDataN(Integer countDataN) {
		this.countDataN = countDataN;
	}
}
