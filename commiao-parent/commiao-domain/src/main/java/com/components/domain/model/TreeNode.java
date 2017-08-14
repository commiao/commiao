package com.components.domain.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * easyui使用的tree模型
 * 
 * Author ningzhitao 
 * Date   15/12/19
 * 
 */
public class TreeNode implements java.io.Serializable {
	private static final long serialVersionUID = 2493902271764895630L;
	private String id;
	private String text;// 树节点名称
	private String url;//树节点的链接
	private String iconCls;// 前面的小图标样式
	private String ischecked ;// 是否勾选状态
	private Boolean checked = false;// 是否勾选状态
	private Map<String, Object> attributes = new HashMap<String, Object>();// 其他参数
	private List<TreeNode> children;// 子节点
	private String state = "open";// 是否展开(open,closed)

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		attributes.put("url", url);
	}
	
	public String getIschecked() {
		return ischecked;
	}

	public void setIschecked(String ischecked) {
		if(Integer.parseInt(ischecked)>0){
			this.checked = true;
		}else{
			this.checked = false;
		}
		this.ischecked = ischecked;
	}
}
