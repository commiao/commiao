package com.commiao.sdk.controller.common.action;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.basic.business.tools.exception.ValidateParamsException;
import com.commiao.basic.business.tools.validate.NumberValidationUtils;
import com.commiao.sdk.controller.common.domain.ControllerResponseBody;
import com.commiao.sdk.controller.common.domain.RequestJsonToBean;
import com.commiao.sdk.controller.common.exception.TransformJsonParamsException;

/**
 * 通用的action
 * @author jannal
 */
@Controller
public class BaseAction {
    
    private static final Logger logger = LoggerFactory.getLogger(BaseAction.class);
    
    /**
     * 通用返回成功或失败参数拼接
     * @param flag
     * @return
     */
    public <T>  ControllerResponseBody<T> defaultResultBack(Boolean flag) {
      if (flag) {
          return defaultSuccess();
      } else {
          return defaultFail();
      }        
  }
    
    public <T>  ControllerResponseBody<T> defaultFail() {
        return (ControllerResponseBody<T>) ControllerResponseBody.defaultFail();
    }



    public <T> ControllerResponseBody<T> defaultSuccess() {
        return (ControllerResponseBody<T>) ControllerResponseBody.defaultSuccess();
    }
    
    
    public <T> ControllerResponseBody<T> defaultFail(String msg,String code){
        return new ControllerResponseBody<T>(ControllerResponseBody.FAILED,msg,code);   
    }
    
    public <T> ControllerResponseBody<T> defaultFail(String msg,String code,T data){
        return new ControllerResponseBody<T>(ControllerResponseBody.FAILED,msg,code,data);   
    }
    /**初始化ControllerResponseBody<T>对象*/
    public <T> ControllerResponseBody<T> getControllerResponseBody(){
    	return new ControllerResponseBody<T>();
    }
    /**json串转bean*/
    public <T> T jsonConvertToBean(String json, Class<T> clazz) throws TransformJsonParamsException{
    	return RequestJsonToBean.requestJsonToBean(json, clazz);
    }
    public Long[] stringsToLongs(String idsStr,String msg) throws ValidateParamsException {
        String[] ids = idsStr.split(",");
        Long[] idsLong = new Long[ids.length];
        for(int i=0;i<ids.length;i++){
            if(NumberValidationUtils.isLongNumeric(ids[i])){
                idsLong[i] =  Long.valueOf(ids[i]);
            }else{
                idsLong = null;
                throw new ValidateParamsException(GlobalResultCode.CommonResultCode.OPERATION_FAILED, GlobalResultCode.CommonResultCode.PARAMS_ILLEGAL, msg);
            }
        }
        return idsLong;
    }
    
    public String[] stringsToStrs(String idsStr,String msg) throws ValidateParamsException {
    	String[] ids = StringUtils.split(idsStr, ",");
		return ids;
    }
    
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
        binder.registerCustomEditor(int.class, new MyEditor());
    }
    
    class MyEditor extends PropertyEditorSupport  {
		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			if(text == null ||text.equals(""))
				text = "0";
			if ( !StringUtils.hasText(text)) {
			
				setValue(null);
			}
			else {
				setValue(Integer.parseInt(text));//这句话是最重要的，他的目的是通过传入参数的类型来匹配相应的databind
			}
		}
		@Override
		public String getAsText() {
			
			return getValue().toString();
		}
}
    
    
    /**
     * 所有ActionMap 统一从这里获取
     * 
     * @return
     */
    public Map<String, Object> getRootMap() {
    
        Map<String, Object> rootMap = new HashMap<String, Object>();
        // 添加url到 Map中
        // rootMap.putAll(URLUtils.getUrlMap());
        return rootMap;
    }
    
    public ModelAndView forword(String viewName, Map<String,?> context) {
    
        return new ModelAndView(viewName, context);
    }
    
    public ModelAndView forword(String viewName) {
        
        return new ModelAndView(viewName);
    }
    
    public ModelAndView error(String errMsg) {
    
        return new ModelAndView("error");
    }
    
    
    
}
