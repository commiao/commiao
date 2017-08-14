package com.commiao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.commiao.domain.pojo.user.User;

/**
 * Author ningzhitao 
 * Date   15/12/19.
 */
@Controller
public class BaseController{
	private static final Logger logger = Logger.getLogger(BaseController.class);
	protected HttpServletRequest request; 
	protected HttpServletResponse response;  
	@ModelAttribute          
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){ 
		this.request = request;        
		this.response = response;     
	}
	/**
	 * 获取当前登录用户
	 * @return
	 */
	public User getLoginUser(){
		return (User) request.getSession().getAttribute("loginUser");
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
	 * 
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
			logger.debug(e.toString());
			
		}
	}
    
}
