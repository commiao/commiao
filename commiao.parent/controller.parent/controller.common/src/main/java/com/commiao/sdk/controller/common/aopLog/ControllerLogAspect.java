package com.commiao.sdk.controller.common.aopLog;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.manager.HTLoggerFactory;

/**
 * CreateDate:2016年11月2日下午2:22:25
 * 
 * @Description: 切点类
 * @author:hehch
 * @version V1.0
 */
@Aspect
@Component
public class ControllerLogAspect {

	private static HTLogger logger = HTLoggerFactory.getLogger(ControllerLogAspect.class);

	@Pointcut("@annotation(com.hengtianjf.sdk.controller.common.aopLog.ControllerMethodLog)")
	public void methodAspect() {
	}

	/**
	 * @Description::前置通知. <br/>
	 * @author hehch
	 * @param joinPoint
	 */
	@Before("methodAspect()")
	public void doBefore(JoinPoint joinPoint) {
		try {
			logger.info("请求方法:{}.{}开始,方法描述:{}, 参数列表{}.", joinPoint.getTarget().getClass().getName(),
					joinPoint.getSignature().getName(), getMethodDescription(joinPoint),
					getParamStr(joinPoint.getArgs()));
		} catch (Exception e) {
			logger.error("前置通知异常!", e);
		}
	}

	/**
	 * @Description::后置通知. <br/>
	 * @author hehch
	 * @param joinPoint
	 */
	@After("methodAspect()")
	public void doAfter(JoinPoint joinPoint) {
		logger.info("请求方法:{}.{},结束.", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName());
	}

	/**
	 * @Description::获取注解中对方法的描述信息. <br/>
	 * @author hehch
	 * @param joinPoint
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static String getMethodDescription(JoinPoint joinPoint) throws Exception {
		String targetName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		Object[] arguments = joinPoint.getArgs();
		Class targetClass = Class.forName(targetName);
		Method[] methods = targetClass.getMethods();
		String description = "";
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				Class[] clazzs = method.getParameterTypes();
				if (clazzs.length == arguments.length) {
					description = method.getAnnotation(ControllerMethodLog.class).description();
					break;
				}
			}
		}
		return description;
	}

	/**
	 * @Description::获取方法的参数列表，只打印出String类型参数. <br/> 
	 * @author hehch
	 * @param args
	 * @return
	 */
	public static String getParamStr(Object[] args) {
		StringBuffer sb = new StringBuffer();
		for (Object obj : args) {
			if (obj instanceof String) {
				String arg = (String) obj;
				sb.append(arg).append(";");
			}
		}

		return sb.toString();
	}
}