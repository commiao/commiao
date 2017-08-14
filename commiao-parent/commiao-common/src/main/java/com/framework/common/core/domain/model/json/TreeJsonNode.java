package com.framework.common.core.domain.model.json;

import java.util.ArrayList;
import java.util.List;


public class TreeJsonNode implements JsonNode {

	public enum CHECKBOX_TYPE {CHECKBOX,RADIO};
	
	private List<TreeJsonNode> nodes = new ArrayList<TreeJsonNode>();
	
	private String id;//序号
	private String title;//菜单名称
	private String link;//下级菜单地址
	
	private String url;//菜单链接地址，如果没有则弹出下级菜单
	private String color;//根据顾问的状态,显示出对应的颜色
	private String target;//菜单地址的目标窗口
	
	private CHECKBOX_TYPE checkbox;//前置类型：无、checkbox或者radio
	private String name;//前置名称
	private String value;//前置值
	private boolean checked = false;//是否选择
	private boolean disabled = false;//是否有效

	private boolean init = false;
	
	public TreeJsonNode() {}
	
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param target
	 */
	public TreeJsonNode(String id, String title, String link, String url,String color) {
		this(id, title, link, url,color, null);
	}
	
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param target
	 */
	public TreeJsonNode(String id, String title, String link, String url,String color, String target) {
		this(id, title, link, url,color, target, null, null, null, false, false);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 */
	public TreeJsonNode(String id, String title, String link, String url,String color, String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled) {
		this.setNode(id, title, link, url, color,target, checkbox, name, value, checked, disabled);
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getUrl() {
		return url;
	}

	public String getTarget() {
		return target;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCheckbox() {
		if(checkbox==null){
			return "";
		}
		if(checkbox.equals(CHECKBOX_TYPE.CHECKBOX)){
			return "checkbox";
		}
		if(checkbox.equals(CHECKBOX_TYPE.RADIO)){
			return "radio";
		}
		return "";
	}

	public boolean getChecked() {
		return checked;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public boolean getDisabled(){
		return disabled;
	}
	
	/**
	 * @param checkbox the checkbox to set
	 * @param checkboxName the checkboxName to se
	 * @param checkboxTitle the checkboxTitle to set
	 * @param checkboxValue the checkboxValue to set
	 */
	public void setCheckbox(CHECKBOX_TYPE checkbox,String name,String value,boolean checked,boolean disabled) {
		this.checkbox = checkbox;
		this.name = name;
		this.value = value;
		this.checked = checked;
		this.disabled = disabled;
	}
	
	//设置所有的值，必须通过这个方法
	private void setNode(String id, String title, String link, String url,String color,String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled) {
		this.id = id;
		this.title = title;
		this.link = link;
		this.url = url;
		this.color = color;
		this.target = target;
		this.checkbox = checkbox;
		this.checked = checked;
		this.name = name;
		this.value = value;
		this.disabled = disabled;
		
		this.init = true;
	}
	
	public static TreeJsonNode newNode(String id, String title, String link, String url,String color,
			String target, CHECKBOX_TYPE checkbox,
			String name, String value,boolean checked,boolean disabled) {
		return new TreeJsonNode(id, title, link, url,color, target, checkbox, name, value,checked,disabled);
	}

	public static TreeJsonNode newNode(String id, String title, String link, String url,String color,
			String target) {
		return new TreeJsonNode(id, title, link,color ,url, target);
	}

	public static TreeJsonNode newNode(String id, String title, String link, String url,String color) {
		return new TreeJsonNode(id, title, link, url,color);
	}
	
	public TreeJsonNode addNode(TreeJsonNode node){
		if(init){
			this.nodes.add(node);
		}else{
			this.setNode(node.id, node.title, node.link, node.url,node.color, node.target, node.checkbox, node.name, node.value, node.checked, node.disabled);
		}
		return this;
	}
	
	public String toJson(){
		StringBuffer ajaxNodes;//select使用ajax时的内容
		
		ajaxNodes = new StringBuffer("[");
		//先添加自己
		addJsonNode(ajaxNodes, this, true);
		//添加其他
		for(TreeJsonNode node : nodes){
			addJsonNode(ajaxNodes, node, false);
		}
		
		ajaxNodes.append("]");
		
		return ajaxNodes.toString();
	}
	private void addJsonNode(StringBuffer ajaxNodes,TreeJsonNode node,boolean isFirst){
		if(!isFirst){
			ajaxNodes.append(",");
		}
		
		boolean node_hasvalue = false;
		ajaxNodes.append("{");
		node_hasvalue = false;
		node_hasvalue = this.genJsonNode(ajaxNodes,"id", node.getId(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"title", node.getTitle(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"link", node.getLink(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"url", node.getUrl(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"color", node.getColor(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"target", node.getTarget(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"checkbox", node.getCheckbox(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"name", node.getName(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"value", node.getValue(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"checked", node.getChecked()?"checked":"",node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(ajaxNodes,"disabled", node.getDisabled()?"disabled":"",node_hasvalue) || node_hasvalue;
		ajaxNodes.append("}");
	}
	private boolean genJsonNode(StringBuffer sb,String key,String value,boolean separator){
		//System.out.println("key="+key+";value="+value);
		if(value == null || value.equals("")){
			return false;
		}
		if(separator){
			sb.append(",");
		}
		sb.append("\"").append(key).append("\":\"").append(value).append("\"");
		return true;
	}
	
	public static void main(String[] args) {
	}

}
