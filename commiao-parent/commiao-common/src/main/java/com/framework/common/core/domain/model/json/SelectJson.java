package com.framework.common.core.domain.model.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Ajax下拉框（LinkSelect）使用的json生成工具
 * @author caoxl
 */
public class SelectJson implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<SelectJsonNode> selectNode = new ArrayList<SelectJsonNode>();

	public SelectJson(){ }
	
	public SelectJson(String text,String value){
		addNode(text, value);
	}
	
	public SelectJson(String text,Integer value){
		addNode(text, value);
	}
	
	public SelectJson(String text,Long value){
		addNode(text, value);
	}
	
	public SelectJsonNode[] getSelectJsonNode(){
		return selectNode.toArray(new SelectJsonNode[selectNode.size()]);
	}
	
	
	public SelectJson addNode(String text,Integer value){
		return addNode(text, String.valueOf(value));
	}
	
	public SelectJson addNode(String text,Long value){
		return addNode(text, String.valueOf(value));
	}
	
	public SelectJson addNode(String text, String value){
		selectNode.add(new SelectJsonNode(text,value));
		return this;
	}
	
	
	public static SelectJson newNode(){
		return new SelectJson();
	}
	
	public static SelectJson newNode(String text,String value){
		return new SelectJson(text, value);
	}
	
	public static SelectJson newNode(String text,Integer value){
		return new SelectJson(text, value);
	}
	
	public static SelectJson newNode(String text,Long value){
		return new SelectJson(text, value);
	}
	

	/**
	 * 子类，存储节点
	 * @author caoxl
	 *
	 */
	public class SelectJsonNode{
		private String value = "";
		private String text = "";
		
		public SelectJsonNode(){}
		public SelectJsonNode(String text,String value){
			setText(text);
			setValue(value);
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
	}
}
