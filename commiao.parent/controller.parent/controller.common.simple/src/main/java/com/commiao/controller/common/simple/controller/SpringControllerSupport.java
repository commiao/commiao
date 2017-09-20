package com.commiao.controller.common.simple.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.commiao.controller.common.simple.constants.CommonConstants;
import com.commiao.controller.common.simple.domain.LoginInfo;
import com.commiao.controller.common.simple.utils.StringUtils;

public class SpringControllerSupport implements SpringController {

	protected final Logger LOG = LoggerFactory.getLogger(getClass());
	
	protected HttpServletRequest request; 
	protected HttpServletResponse response;
	protected HttpSession session;
	@ModelAttribute          
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){ 
		this.request = request;        
		this.response = response;
		this.session = request.getSession();
	}
	
	private String basePath = "";
	
	public SpringControllerSupport(){
		RequestMapping annotation = getClass().getAnnotation(RequestMapping.class);
		if(annotation != null && annotation.value() != null && annotation.value().length > 0){
			this.basePath = annotation.value()[0];
		}
	}
	
	/**
	 * 返回指定的文件名
	 * @param path
	 * @return
	 */
	protected String getViewPath(String path){
		return basePath + (path.startsWith("/")?"":"/") + path;
	}
	
	/**
	 * 返回与请求路径匹配的文件名
	 * @param path
	 * @return
	 */
	protected String getViewNamedPath(String path){
		StringBuilder builder = new StringBuilder(basePath).append("/");
		String className = getClass().getSimpleName();
		if(className.endsWith("Controller") && className.length() > 10){
			className = className.substring(0, className.length() - 10);
		}
		builder.append(StringUtils.toUnderScoreCase(className,"-")).append("-");
		if(path.startsWith("/")){
			builder.append(path.substring(1));
		}else{
			builder.append(path);
		}
		return builder.toString();
	}
	
	/**
	 * 获取登录信息
	 * @return
	 */
	public LoginInfo getLoginInfo() {
		return (LoginInfo)request.getSession().getAttribute(CommonConstants.SESSION_LOGININFO_KEY);
	}

	/**
     * 获取客户端的实际IP
     * @param request
     * @return
     */
    public String getClientIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");

        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
    
	/**
	 * 将对象转换成JSON字符串，并响应回前台
	 * @param object
	 * @throws IOException
	 */
	public void writeJson(Object object) {
		
		try {
			String json = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss", SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.BrowserCompatible);
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.debug(e.toString());
			
		}
	}
}
