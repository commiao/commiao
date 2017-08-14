package com.commiao.domain.model;

import com.commiao.domain.constants.Constants;

/**
 * @author jingmiao
 * 组装并获得一个Map<String,Object>对象
 */
public class ParamterMap{
	private static java.util.Map<String,Object> param = null;
	
	private static java.util.Map<String,Object> getInstance(){
		param = new java.util.HashMap<String, Object>();
		param.put("status", Constants.GLOBLE_YES);
		return param;
	}
	
	/**
	 * 组装一个默认Map<String,Object>对象 status值
	 * @return
	 */
	public static java.util.Map<String,Object> build(){
		return getInstance();
	}
	
	/**
	 * 向map参数中添加一个 status值
	 * @param paramterMap
	 * @return
	 */
	public static java.util.Map<String,Object> build(java.util.Map<String,Object> paramterMap){
		if(paramterMap==null) return getInstance();
		paramterMap.put("status", Constants.GLOBLE_YES);
		return paramterMap;
	}
	
	/**
	 * 将Class类实例化对象转换为Map<String,Object>对象 status值
	 * @param obj
	 * @return
	 */
	public static java.util.Map<String, Object> build(Object obj) {
		if(obj==null) return getInstance();
		java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
		try {
			org.apache.commons.beanutils.PropertyUtilsBean propertyUtilsBean = new org.apache.commons.beanutils.PropertyUtilsBean();
			java.beans.PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
			for (int i = 0; i < descriptors.length; i++) {
				String name = descriptors[i].getName();
				if (!org.apache.commons.lang.StringUtils.equals(name, "class")) {
					if(propertyUtilsBean.getNestedProperty(obj, name)!=null){
						params.put(name,propertyUtilsBean.getNestedProperty(obj, name));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return params;
	}
	
	/**
	 * 组装并获得一个Map<String,Object>对象
	 * @param keys "{A}{B}{C}..."
	 * @param objs A,B,C...
	 * @return
	 */
	public static java.util.Map<String,Object> build(String keys,Object... objs){
		if(keys==null || "".equals(keys.trim()) || keys.length()<1){
			System.out.println("【失败】传入keys值不能为空");
			return param;
		}
		if(objs==null || objs.length<1){
			System.out.println("【失败】传入objs值不能为空");
			return param;
		}
		getInstance();
		java.util.Map<Integer,String> keyMap = getParamKeys(keys);
		if(keyMap.size()!=objs.length){
			System.out.println("【失败】keys与objs的参数数量不一致");
			return param;
		}
		for(int i=0;i<objs.length;i++){
			param.put(keyMap.get(i), objs[i]);
		}
		return param;
	}
	
	/**
	 * 解析{}{}...类型的字符串
	 * @param keys
	 * @return
	 */
	private static java.util.Map<Integer,String> getParamKeys(String keys){
		java.util.Map<Integer,String> keyMap = new java.util.HashMap<Integer, String>();
		keys = keys.replaceAll("[}]\\w+[{]", "");
		keys = keys.replace("{", "");
		keys = keys.replace("}", " ");
		keys = keys.trim();
		String[] s = keys.split(" ");
		for(int i = 0; i < s.length; i++){
			keyMap.put(i, s[i]);
		}
		return keyMap;
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String str = "{loanId}{userId}{nickname}";
		java.util.Map<String,Object> keyMap = ParamterMap.build(str, 1,1001,"井淼");
		java.util.Iterator it = keyMap.entrySet().iterator();
		while(it.hasNext()){
		java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
		// entry.getKey() 返回与此项对应的键
		// entry.getValue() 返回与此项对应的值
		System.out.print("{key:"+entry.getKey());
		System.out.println(",value:"+entry.getValue()+"}");
		}
	}
}
