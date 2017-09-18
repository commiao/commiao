package com.commiao.basic.business.tools.common;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.commiao.basic.business.tools.config.ConfigBean;


/**
 * 接口url 管理
 * @author "xuliang"
 *
 */
public class UrlUtils {
	private static final String HTTP="http://";
	public static String getUrl(String uri){
		return ConfigBean.getConfigBean().getPefHsConfig().getInterfaceBaseurl() + ConfigBean.getConfigBean().getPropertiesValue("${"+uri+"}");
	}
	public static String getUrlpubFund(String uri){
		return ConfigBean.getConfigBean().getPefHsConfig().getPublicFund() + ConfigBean.getConfigBean().getPropertiesValue("${"+uri+"}");
	}
	public static String getUrlsmallFund(String uri){
		return ConfigBean.getConfigBean().getPefHsConfig().getSmallFund() + ConfigBean.getConfigBean().getPropertiesValue("${"+uri+"}");
	}
	
	/**
	 * 添加http
	 * @param targetUrl
	 * @return
	 */
	public static String addHttp(String targetUrl){
		if(targetUrl==null || "".equals(targetUrl)){
			return "";
		}
		int index=targetUrl.indexOf("http");
		boolean isdomain=isDomain(targetUrl);
		if(index<0&&isdomain){
			return HTTP+targetUrl;
		}
		return targetUrl;
	}
	
	public static boolean isDomain(String url){
		if(url.indexOf(".com")>0||url.indexOf(".cn")>0 ||url.indexOf(".net")>0 ||url.indexOf(".org")>0 ){
			return true;
		}
		return false;
	}
}
