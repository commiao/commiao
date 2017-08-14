package com.framework.common.core.domain.model.json;


/**
 * Ajax下拉框（LinkSelect）使用的json生成工具
 * @author caoxl
 */
public class SelectNode implements JsonNode{

	
	private StringBuffer selectNode;//ajax串
	private boolean formatJson = false;
	
	public static SelectNode newNode(){
		return new SelectNode();
	}
	
	public static SelectNode newNode(Long value, String title){
		return new SelectNode(value, title);
	}
	
	public static SelectNode newNode(Long value, String title, boolean disabled, String color){
		return new SelectNode(value, title, disabled, color);
	}
	
	public static SelectNode newNode(String value, String title){
		return new SelectNode(value, title);
	}
	
	public static SelectNode newNode(String value, String title, boolean disabled, String color){
		return new SelectNode(value, title, disabled, color);
	}
	
	public SelectNode(){ }
	
	public SelectNode(String value,String title){
		addNode(value, title);
	}
	
	public SelectNode(Long value,String title){
		addNode(value, title);
	}
	
	public SelectNode(String value, String title, boolean disabled, String color){
		addNode(value, title, disabled, color);
	}
	
	public SelectNode(Long value, String title, boolean disabled, String color){
		addNode(value, title, disabled, color);
	}
	
	public SelectNode addNode(String value,String title){
		addNode(value, title, false, null);
		return this;
	}
	
	public SelectNode addNode(Long value,String title){
		addNode(value, title, false, null);
		return this;
	}
	public SelectNode addNode(Long value, String title, boolean disabled, String color){
		addNode(String.valueOf(value),title,disabled,color);
		return this;
	}
	
	public SelectNode addNode(String value, String title, boolean disabled, String color){
		if(selectNode == null){
			selectNode = new StringBuffer("[");
		}else{
			selectNode.append(",");
		}
		selectNode.append("{\"value\":\"").append(value).append("\",\"title\":\"").append(title);
		if(disabled){
			selectNode.append("\",\"disabled\":\"").append("true");
			if(color == null || color.equals("")){
				color = "#999999";
			}
		}
		if(color != null && !color.equals("")){
			selectNode.append("\",\"color\":\"").append(color);
		}
		selectNode.append("\"}");
		return this;
	}
	
	public String toJson(){
		if(selectNode == null){
			return "[{}]";
		}
		if(!formatJson){
			selectNode.append("]");
			formatJson = true;
		}
		return selectNode.toString();
	}
	
	public static void main(String[] args) {
	}

}
