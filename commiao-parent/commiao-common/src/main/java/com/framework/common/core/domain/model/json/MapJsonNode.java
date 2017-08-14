package com.framework.common.core.domain.model.json;


public class MapJsonNode implements JsonNode{

	
	private StringBuffer ajaxNodes;//select使用ajax时的内容
	private boolean formatJson = false;
	
	public static MapJsonNode newNode(){
		return new MapJsonNode();
	}
	
	public static MapJsonNode newNode(Long value, String title){
		return new MapJsonNode(value, title);
	}
	
	public static MapJsonNode newNode(String value, String title){
		return new MapJsonNode(value, title);
	}
	
	public MapJsonNode(){ }
	
	public MapJsonNode(String value,String title){
		addNode(value, title);
	}
	
	public MapJsonNode(Long value,String title){
		addNode(value, title);
	}
	
	public MapJsonNode addNode(String value,String title){
		if(ajaxNodes == null){
			ajaxNodes = new StringBuffer("[{\"value\":\"").append(value)
					.append("\",\"title\":\"").append(title).append("\"}");
		}else{
			ajaxNodes.append(",{\"value\":\"").append(value)
			.append("\",\"title\":\"").append(title).append("\"}");
		}
		return this;
	}
	
	public MapJsonNode addNode(Long value,String title){
		addNode(String.valueOf(value),title);
		return this;
	}
	
	public String toJson(){
		if(ajaxNodes == null){
			return "[]";
		}
		if(!formatJson){
			ajaxNodes.append("]");
			formatJson = true;
		}
		return ajaxNodes.toString();
	}
	
	public static void main(String[] args) {
	}

}
