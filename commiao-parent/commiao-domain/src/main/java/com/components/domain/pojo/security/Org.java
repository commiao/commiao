package com.components.domain.pojo.security;

import java.util.List;

import com.commiao.domain.pojo.BaseData;

/**
 * 映射数据库组织机构类
 */
public class Org extends BaseData {
	private static final long serialVersionUID = 1L;
	List<Org> children;
	
	/**
	 * 部门（总部）、分公司、部门（分公司）
	 */
	private Long orgType;
	/**
	 * 机构名称
	 */
	private String name;
	/**
	 * 机构代码
	 */
	private String code;
	/**
	 * 机构地址
	 */
	private String address;
	/**
	 * 机构序号
	 */
	private Integer ordersn;
	/**
	 * 父机构ID
	 */
	private Integer parentId;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 机构简介
	 */
	private String description;
	/**
	 * 创建人
	 */
	private Integer creator;
	/**
	 * 修改人
	 */
	private Integer updator;
	/**
	 * 分公司网站编码
	 */
	private String websiteCode;
	public List<Org> getChildren() {
		return children;
	}
	public void setChildren(List<Org> children) {
		this.children = children;
	}
	public Long getOrgType() {
		return orgType;
	}
	public void setOrgType(Long orgType) {
		this.orgType = orgType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getOrdersn() {
		return ordersn;
	}
	public void setOrdersn(Integer ordersn) {
		this.ordersn = ordersn;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	public Integer getUpdator() {
		return updator;
	}
	public void setUpdator(Integer updator) {
		this.updator = updator;
	}
	public String getWebsiteCode() {
		return websiteCode;
	}
	public void setWebsiteCode(String websiteCode) {
		this.websiteCode = websiteCode;
	}
	
	
}
