package com.commiao.sdk.controller.common.aopLog;

import java.lang.annotation.*;

/**
 * CreateDate:2016年11月2日下午2:24:00
 * 
 * @Description: 自定义注解 拦截方法 添加系统日志
 * @author:hehch
 * @version V1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerMethodLog {

	/**
	 * @Description::方法描述信息. <br/> 
	 * @author hehch
	 * @return
	 */
	String description() default "";

}