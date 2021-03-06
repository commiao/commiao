package com.framework.common.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UrlInterceptor implements HandlerInterceptor  {
	protected final Logger logger = Logger.getLogger(getClass());
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView == null){
			return;
		}
		//设置工程路径，给页面使用
		modelAndView.addObject("base",request.getContextPath());
		logger.info("base:"+request.getContextPath());
		//设置基本的url路径，不包括参数
		StringBuilder url = new StringBuilder();
		url.append(request.getServletPath()); //请求页面或其他地址
		modelAndView.addObject("servletPath",url.toString());
		logger.info("servletPath:"+url.toString());
		//设置完整的url路径，包括参数
		String param = request.getQueryString();
		if(param != null && !param.equals("")){
			url.append("?").append(param);
		}
		modelAndView.addObject("servletURL",url.toString());
		logger.info("servletURL:"+url.toString());
		//设置上一次访问的页面路径
		String preUrl = request.getHeader("Referer");
		if(preUrl != null){
			modelAndView.addObject("refererPath",preUrl);
			logger.info("Referer:"+preUrl.toString());
		}
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}   

}