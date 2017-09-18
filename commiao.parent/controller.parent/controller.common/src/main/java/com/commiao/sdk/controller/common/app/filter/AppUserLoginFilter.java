package com.commiao.sdk.controller.common.app.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.alibaba.fastjson.JSONObject;
import com.chtwm.mall.pojo.UserInfo;
import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.sdk.controller.common.app.config.ConfigPropertiesBean;
import com.commiao.sdk.controller.common.domain.ControllerResponseBody;

import basic.arch.tools.utils.common.BigdataConstants;

public class AppUserLoginFilter implements Filter {

    protected static String[] excludeUrls = new String[] {};
    private static final String SEPARATOR = ","; // 分割符

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
     
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        
        if (!(servletRequest instanceof HttpServletRequest) || !(servletResponse instanceof HttpServletResponse)) {
            throw new ServletException(" just supports HTTP requests");
        }
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        
        if(excludeUrls.length == 0){
            WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(httpRequest.getServletContext());
            if (webApplicationContext != null) {
                ConfigPropertiesBean configPropertiesBean = (ConfigPropertiesBean) webApplicationContext.getBean(ConfigPropertiesBean.class);
                if (configPropertiesBean != null) {
                    String excludePath = configPropertiesBean.getExcludePath();
                    if (!StringUtils.isEmpty(excludePath)) {
                        excludeUrls = excludePath.split(SEPARATOR);
                    }
                }
            }
        }
      
        

     

        HttpSession session = httpRequest.getSession(true);
        String url = httpRequest.getRequestURI();

        if (excludeUrls != null && excludeUrls.length > 0) {
            for (String str : excludeUrls) {
                if (str.equals(url) || url.indexOf(str) >= 0) {
                    filterChain.doFilter(servletRequest, servletResponse);
                    return;
                }
            }
            Object object = session.getAttribute(BigdataConstants.SESSION_USER_KEY);
            UserInfo userInfo = object == null ? null : (UserInfo) object;
            if (userInfo == null) {
                httpResponse.setCharacterEncoding("UTF-8");
                ControllerResponseBody<Object> appResponseBody = new ControllerResponseBody<Object>();
                appResponseBody.setStatus(ControllerResponseBody.FAILED);
                appResponseBody.setCode(GlobalResultCode.CommonResultCode.NEED_LOGIN);
                appResponseBody.setMsg("请重新登录！");
                String json = JSONObject.toJSONString(appResponseBody);
                httpResponse.getOutputStream().write(json.getBytes("UTF-8"));
                return;
            }
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
    }

    @Override
    public void destroy() {

    }

}
