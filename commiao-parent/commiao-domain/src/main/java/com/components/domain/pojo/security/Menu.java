package com.components.domain.pojo.security;
import com.commiao.domain.pojo.BaseData;

/**
 * 数据库映射菜单类
 */
public class Menu extends BaseData{
	private static final long serialVersionUID = 1L;
	/**
	 * 菜单名称
	 */
	private String title;
	/**
	 * 菜单地址
	 */
	private String url;
	/**
	 * 菜单编码
	 */
	private String code;
	/**
	 * 菜单序号
	 */
	private Integer ordersn;
	/**
	 * 父菜单ID
	 */
	private Long parentId;
	/**
	 * 层级
	 */
	private Long menuLevel;
	/**
	 * 菜单简介
	 */
	private String description;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 创建人
	 */
	private Integer creator;
	/**
	 * 修改人
	 */
	private Integer updator;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Long getMenuLevel() {
		return menuLevel;
	}
	public void setMenuLevel(Long menuLevel) {
		this.menuLevel = menuLevel;
	}
}
