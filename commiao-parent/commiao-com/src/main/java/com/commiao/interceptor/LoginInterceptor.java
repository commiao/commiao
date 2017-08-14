package com.commiao.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 登陆拦截器
 * Author ningzhitao 
 * Date   15/12/19.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /** system log. */
    private final Logger log = Logger.getLogger(LoginInterceptor.class);
    /**
     * Constructor.
     */
    public LoginInterceptor() {
    }

    @Override
    public boolean preHandle(final HttpServletRequest request,
            final HttpServletResponse response, final Object handler)
            throws Exception {
    	String requestUri = request.getRequestURI();
    	log.info("访问的URI路径："+requestUri+",改了吗？这个");
    	if(log.isDebugEnabled()){
            log.debug("requestURI="+requestUri);
        }
//        final User usr = (User) request.getSession().getAttribute("user");
//        if (null == usr) {
//            if (log.isDebugEnabled()) {
//                log.debug("未登录用访问：" + request.getRequestURI());
//            }
//            response.sendRedirect(request.getContextPath()+"/login");
//            return false;
//        } else {
//        	if(/*usr.getIsAdmin()==0 &&*/ requestUri.contains("/admin")){
//        		response.sendRedirect(request.getContextPath()+"/myspace");
//        		return false;
//        	}
//            return true;
//        }
    	return true;
    }
}
