package com.commiao.sdk.controller.common.velocity;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.manager.HTLoggerFactory;
/**
 * CreateDate:2016年9月27日上午9:15:11 
 * @Description: 多视图解析器   
 * @author:jannal
 * @version V1.0
 */
public class MultDevViewResolver implements ViewResolver  {
        
    private HTLogger logger = HTLoggerFactory.getLogger(MultDevViewResolver.class);

        public View resolveViewName(String viewName, Locale locale) throws Exception {
           for(Map.Entry<Set<String>, ViewResolver> map : viewResolverMap.entrySet()){
               Set<String> suffixs = map.getKey();
               for(String suffix : suffixs){
                   if (viewName.endsWith(suffix)){
                       ViewResolver viewResolver = map.getValue();
                       if(null != viewResolver){
                                logger.debug("found viewResolver '" + viewResolver + "' for viewName '" + viewName+ "'");
                           return viewResolver.resolveViewName(viewName, locale);
                       }
                   }
               }
           }
           
           if(defaultViewResolver != null){
               return defaultViewResolver.resolveViewName(viewName, locale);
           }
           // to allow for ViewResolver chaining
           return null;
        }
        
        
        private Map<Set<String>,ViewResolver> viewResolverMap = new HashMap<Set<String>,ViewResolver>();
        
        private ViewResolver defaultViewResolver = null;

        public Map<Set<String>, ViewResolver> getViewResolverMap() {
            return viewResolverMap;
        }

        public void setViewResolverMap(Map<Set<String>, ViewResolver> viewResolverMap) {
            this.viewResolverMap = viewResolverMap;
        }

        public ViewResolver getDefaultViewResolver() {
            return defaultViewResolver;
        }

        public void setDefaultViewResolver(ViewResolver defaultViewResolver) {
            this.defaultViewResolver = defaultViewResolver;
        }
    }