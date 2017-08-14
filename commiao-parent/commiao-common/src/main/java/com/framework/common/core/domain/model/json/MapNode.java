package com.framework.common.core.domain.model.json;


/**
 * 键值对json串的生成工具
 * @author caoxl
 */
public class MapNode implements JsonNode{

	
	private StringBuffer mapNodes;//ajax串
	private boolean formatJson = false;
	
	public static MapNode newNode(){
		return new MapNode();
	}
	
	public static MapNode newNode(Long value, String title){
		return new MapNode(value, title);
	}
	
	public static MapNode newNode(String value, String title){
		return new MapNode(value, title);
	}
	
	public MapNode(){ }
	
	public MapNode(String value,String title){
		addNode(value, title);
	}
	
	public MapNode(Long value,String title){
		addNode(value, title);
	}
	
	public MapNode addNode(String value,String title){
		if(mapNodes == null){
			mapNodes = new StringBuffer("[{\"value\":\"").append(value)
					.append("\",\"title\":\"").append(title).append("\"}");
		}else{
			mapNodes.append(",{\"value\":\"").append(value)
			.append("\",\"title\":\"").append(title).append("\"}");
		}
		return this;
	}
	
	public MapNode addNode(Long value,String title){
		addNode(String.valueOf(value),title);
		return this;
	}
	
	public String toJson(){
		if(mapNodes == null){
			return "[{}]";
		}
		if(!formatJson){
			mapNodes.append("]");
			formatJson = true;
		}
		return mapNodes.toString();
	}
	
	public static void main(String[] args) {
	}

}
