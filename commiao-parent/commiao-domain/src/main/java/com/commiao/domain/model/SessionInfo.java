package com.commiao.domain.model;

import java.util.List;

import com.components.domain.model.TreeNode;

/**
 * sessionInfo模型
 * 
 * Author ningzhitao 
 * Date   15/12/19
 * 
 */
public class SessionInfo implements java.io.Serializable {

	private int userId;// 用户ID
	private String realName;//用户真名
	private String loginName;// 用户登录名称
	private String loginPassword;// 登录密码
	private String userType;// 用
	private String ip;// IP地址
	private List auths;// 用户拥有的权限
	private List menus;// 用户可以访问的菜单
	private List<TreeNode> menuTree;// 用户可以访问的菜单(可以是多重的)

	public List<TreeNode> getMenuTree() {
		return menuTree;
	}

	public void setMenuTree(List<TreeNode> menuTree) {
		this.menuTree = menuTree;
	}

	public List getAuths() {
		return auths;
	}

	public void setAuths(List auths) {
		this.auths = auths;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return loginName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public List getMenus() {
		return menus;
	}

	public void setMenus(List menus) {
		this.menus = menus;
	}
}
