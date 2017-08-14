package com.commiao.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.framework.common.core.CommonConstants;
import com.framework.common.core.configuration.ConfigUtils;
import com.framework.common.core.domain.model.LoginInfo;

/**
 * 登陆拦截器
 * Author ningzhitao 
 * Date   15/12/19.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /** system log. */
    private final Logger LOG = Logger.getLogger(LoginInterceptor.class);
    /**
     * Constructor.
     */
    public LoginInterceptor() {
    }

    @Override
    public boolean preHandle(final HttpServletRequest request,
            final HttpServletResponse response, final Object handler)
            throws Exception {
		LOG.debug("执行登录拦截器");
        LoginInfo loginInfo = (LoginInfo)request.getSession().getAttribute(CommonConstants.SESSION_LOGININFO_KEY);
        if(loginInfo == null && handler instanceof HandlerMethod){
			String login_url = ConfigUtils.get(CommonConstants.CONFIG_LOGIN_URL, request.getContextPath()+"/") ;
			if(login_url==null){
				login_url = "/commiao-mgt/index";
			}
			response.sendRedirect(login_url);
			if(LOG.isDebugEnabled()){
				LOG.debug("用户没有登录，重定向到网站根目录！");
			}
			return false;
		}
		return true;
    }
}
