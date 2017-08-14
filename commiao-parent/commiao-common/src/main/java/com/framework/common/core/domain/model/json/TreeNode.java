package com.framework.common.core.domain.model.json;

import java.util.ArrayList;
import java.util.List;


/**
 * Ajax树（Tree）使用的json生成工具
 * @author caoxl
 */
public class TreeNode implements JsonNode {

	public enum CHECKBOX_TYPE {CHECKBOX,RADIO};
	
	private List<TreeNode> nodes = new ArrayList<TreeNode>();
	
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
	private boolean open = false;//是否自动展开下一级
	
	private boolean init = false;
	
	private List<String> datas;
	
	public TreeNode() {}
	
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 */
	public TreeNode(String id, String title, String link, String url,String color) {
		this(id, title, link, url,color, null);
	}
	
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 */
	public TreeNode(String id, String title, String link, String url,String color, String target) {
		this(id, title, link, url,color, target, null, null, null, false, false,false);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 * @param disabled
	 */
	public TreeNode(String id, String title, String link, String url,String color, String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled) {
		this.setNode(id, title, link, url, color,target, checkbox, name, value, checked, disabled,false,null);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 * @param disabled
	 * @param open
	 */
	public TreeNode(String id, String title, String link, String url,String color, String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled,boolean open) {
		this.setNode(id, title, link, url, color,target, checkbox, name, value, checked, disabled,open,null);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 * @param disabled
	 * @param open
	 * @param datas
	 */
	public TreeNode(String id, String title, String link, String url,String color, String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled,boolean open,List<String> datas) {
		this.setNode(id, title, link, url, color,target, checkbox, name, value, checked, disabled,open,datas);
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
	
	public boolean getOpen(){
		return open;
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
	
	public TreeNode addData(String data){
		if(datas == null){
			datas = new ArrayList<String>();
		}
		datas.add(data==null?"":data);
		return this;
	}
	
	public List<String> getDatas(){
		return datas;
	}
	
	//设置所有的值，必须通过这个方法
	private void setNode(String id, String title, String link, String url,String color,String target, 
			CHECKBOX_TYPE checkbox, String name, String value,boolean checked,boolean disabled,boolean open,List<String> datas) {
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
		this.open = open;
		this.datas = datas;
		
		this.init = true;
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 * @param disabled
	 * @param open
	 */
	public static TreeNode newNode(String id, String title, String link, String url,String color,
			String target, CHECKBOX_TYPE checkbox,
			String name, String value,boolean checked,boolean disabled,boolean open) {
		return new TreeNode(id, title, link, url,color, target, checkbox, name, value,checked,disabled,open);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 * @param checkbox
	 * @param name
	 * @param value
	 * @param checked
	 * @param disabled
	 */
	public static TreeNode newNode(String id, String title, String link, String url,String color,
			String target, CHECKBOX_TYPE checkbox,
			String name, String value,boolean checked,boolean disabled) {
		return new TreeNode(id, title, link, url,color, target, checkbox, name, value,checked,disabled);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 * @param target
	 */
	public static TreeNode newNode(String id, String title, String link, String url,String color,
			String target) {
		return new TreeNode(id, title, link,color ,url, target);
	}
	/**
	 * @param id
	 * @param title
	 * @param link
	 * @param url
	 * @param color
	 */
	public static TreeNode newNode(String id, String title, String link, String url,String color) {
		return new TreeNode(id, title, link, url,color);
	}
	
	public TreeNode addNode(TreeNode node){
		if(init){
			nodes.add(node);
		}else{
			setNode(node.getId(), node.getTitle(), node.getLink(), node.getUrl(),node.getColor(), node.getTarget(), node.checkbox, node.getName(), node.getValue(), node.getChecked(), node.getDisabled(),node.getOpen(),node.getDatas());
		}
		return this;
	}
	
	public String toJson(){
		StringBuffer treeNodes;//生成Json时使用
		
		treeNodes = new StringBuffer("[");
		//先添加自己
		addJsonNode(treeNodes, this, true);
		//添加其他
		for(TreeNode node : nodes){
			addJsonNode(treeNodes, node, false);
		}
		
		treeNodes.append("]");
		
		return treeNodes.toString();
	}
	private void addJsonNode(StringBuffer treeNodes,TreeNode node,boolean isFirst){
		if(!isFirst){
			treeNodes.append(",");
		}
		
		boolean node_hasvalue = false;
		treeNodes.append("{");
		node_hasvalue = false;
		node_hasvalue = this.genJsonNode(treeNodes,"id", node.getId(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"title", node.getTitle(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"link", node.getLink(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"url", node.getUrl(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"color", node.getColor(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"target", node.getTarget(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"checkbox", node.getCheckbox(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"name", node.getName(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"value", node.getValue(),node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"checked", node.getChecked()?"checked":"",node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"disabled", node.getDisabled()?"disabled":"",node_hasvalue) || node_hasvalue;
		node_hasvalue = this.genJsonNode(treeNodes,"open", node.getOpen()?"open":"",node_hasvalue) || node_hasvalue;
		this.genJsonData(treeNodes,node.getDatas(),node_hasvalue);
		treeNodes.append("}");
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
	
	private boolean genJsonData(StringBuffer sb, List<String> datas, boolean separator){
		//System.out.println("key="+key+";value="+value);
		if(datas == null || datas.isEmpty()){
			return false;
		}
		if(separator){
			sb.append(",");
		}
		sb.append("\"data\":[");
		boolean is_first = true;
		for(String data : datas){
			if(!is_first){
				sb.append(",");
			}else{
				is_first=false;
			}
			sb.append("\"").append(data).append("\"");
		}
		sb.append("]");
		return true;
	}
	
	public static void main(String[] args) {
	}

}
