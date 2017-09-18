package com.chtwm.mall.commons;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

import com.commiao.basic.business.tools.common.constant.BigdataConstants;

/**
 * CreateDate:2016年11月6日上午11:30:56
 * 
 * @Description: Controller工具类
 * @author:hehch
 * @version V1.0
 */
public class ControllerBodyUtils {

	/**
	 * @Description::将值为null的字段改为""空字符串. <br/>
	 * @author hehch
	 * @param target
	 */
	public static void setDefaultValue(Object target) {
		if (target != null) {
			try {
				BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass(), Object.class);
				PropertyDescriptor[] propertyDescripions = beanInfo.getPropertyDescriptors();

				for (PropertyDescriptor propertyDescripion : propertyDescripions) {
					Object value = propertyDescripion.getReadMethod().invoke(target);
					if (value == null) {
						propertyDescripion.getWriteMethod().invoke(target,
								BigdataConstants.APP_DEFAULT_NULL);
					}
				}
			} catch (IntrospectionException e) {

			} catch (IllegalArgumentException e) {

			} catch (IllegalAccessException e) {

			} catch (InvocationTargetException e) {

			}
		}
	}
}
