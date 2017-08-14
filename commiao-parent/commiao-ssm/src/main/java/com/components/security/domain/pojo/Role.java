package com.components.security.domain.pojo;


/**
 * 角色类
 */
public class Role extends BaseData{
	private static final long serialVersionUID = 1L;
	/**
	 * 角色名称
	 */
	private String  name;
	/**
	 * 角色编码
	 */
	private String  code;
	/**
	 * 角色序号
	 */
	private Integer ordersn;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 角色简介
	 */
	private String  description;
	/**
	 * 创建人
	 */
	private Integer  creator;
	/**
	 * 修改人
	 */
	private Integer  updator;
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
	public Integer getOrdersn() {
		return ordersn;
	}
	public void setOrdersn(Integer ordersn) {
		this.ordersn = ordersn;
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
}
