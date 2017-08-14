package com.framework.common.field;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class FieldService {
	/**
	 * 获取字段名称list
	 * @param c
	 * @return
	 */
	public static List<String> getKeysToList(Class<?> c) {
		List<String> list = new ArrayList<String>();
		try {
			// 根据Class的静态方法获取所以字段名称、不包括继承字段
			Field[] fs = c.getDeclaredFields();
			for (int i = 0; i < fs.length; i++) {
				list.add(fs[i].getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 获取字段名称arr数组
	 * @param c
	 * @return
	 */
	public static String[] getKeysToArr(Class<?> c) {
		String[] arr = null;
		try {
			// 根据Class的静态方法获取所以字段名称、不包括继承字段
			Field[] fs = c.getDeclaredFields();
			arr = new String[fs.length];
			for (int i = 0; i < fs.length; i++) {
				arr[i] = fs[i].getName();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	
}
