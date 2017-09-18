package com.chtwm.mall.commons;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;

import basic.arch.component.http.common.HttpHeader;


/**
 * http通用工具
 * @author wrx
 *
 */
public class HttpCommonUtil {
	/**
	 * 把cookie放入header
	 * @param request 
	 * @return
	 */
	public static Header[] servletCookieToHttpClientHeaders(HttpServletRequest request){
		String cookies=request.getHeader("Cookie");
		Header[] header=null;
		if(cookies!=null){
			header=HttpHeader.custom().cookie(cookies).build();
		}
		return header;
	}
}
