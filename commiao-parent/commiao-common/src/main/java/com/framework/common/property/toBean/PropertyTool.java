package com.framework.common.property.toBean;

import java.lang.reflect.Proxy;
import java.util.Properties;

public class PropertyTool {

	private PropertyTool() {

	}

	@SuppressWarnings("unchecked")
	public static <T> T bindProperties(Class<T> clazz, Properties properties) {
		return (T) Proxy.newProxyInstance(
				Thread.currentThread().getContextClassLoader(), 
				new Class[] { clazz }, 
				new PropertyInvokationHandler(properties)
			);
	}
}