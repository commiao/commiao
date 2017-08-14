package com.framework.common.core.spring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringBeanLoader extends HttpServlet  {
   
	private static final long serialVersionUID = 1L;
	private static final Log log = LogFactory.getLog(SpringBeanLoader.class);
	private static WebApplicationContext ctx = null;
 
    public void init() throws ServletException{
    	log.info("SpringBeanLoader initialized!");
    	ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }
    
    protected static WebApplicationContext getWebApplicationContext(){
    	return ctx;
    }
    /**
     * 根据提供的bean名称得到相应的类     
     * @param servName bean名称     
     */
     public static Object getBean(String name) {
         return ctx.getBean(name);
     }
  
     /**
     * 根据提供的bean名称得到对应于指定类型的类
     * @param servName bean名称
     * @param clazz 返回的bean类型,若类型不匹配,将抛出异常
     */
     @SuppressWarnings("unchecked")
     public static <T> T getBean(String name, T clazz) {
         return (T)ctx.getBean(name, clazz.getClass());
     }
     
     public static <T> T getBean(String name, Class<T> clazz) {
         return ctx.getBean(name, clazz);
     }

}