package com.framework.common.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor  {

	protected final Logger logger = Logger.getLogger(getClass());
    /**
     * Constructor.
     */
    public LoginInterceptor() {
    }
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
    	String requestUri = request.getRequestURI();
    	logger.info("访问地址："+requestUri);
    	if(logger.isDebugEnabled()){
    		logger.debug("requestURI="+requestUri);
        }
//		LoginInfo loginInfo = (LoginInfo)request.getSession().getAttribute(HuixinConstants.SESSION_LOGININFO_KEY);
//		if(loginInfo == null && handler instanceof HandlerMethod){
//			String login_url = ConfigUtils.get(HuixinConstants.CONFIG_LOGIN_URL, request.getContextPath()+"/") ;
//			response.sendRedirect(login_url);
//			if(logger.isDebugEnabled()){
//				logger.debug("用户没有登录，重定向到网站根目录！");
//			}
//			return false;
//		}
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}   

}