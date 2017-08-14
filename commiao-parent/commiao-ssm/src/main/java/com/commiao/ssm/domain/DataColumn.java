package com.commiao.ssm.domain;

import com.framework.common.core.entity.Entity;
import com.framework.common.core.entity.EntitySupport;

public class DataColumn extends EntitySupport implements Entity{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer countData;
	private Integer countDataY;
	private Integer countDataN;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
