package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * sforce 配置类
 * @author jannal
 */
@Component
public class SForceConfig {

	@Value("${wsdl_server_url_haomao}")
	private String wsdl_server_url_haomao;
	@Value("${wsdl_server_url_store}")
	private String wsdl_server_url_store;
	@Value("${wsdl_server_url_wechat}")
	private String wsdl_server_url_wechat;

	public String getWsdl_server_url_haomao() {
		return wsdl_server_url_haomao;
	}

	public String getWsdl_server_url_store() {
		return wsdl_server_url_store;
	}

	public String getWsdl_server_url_wechat() {
		return wsdl_server_url_wechat;
	}
	
	
	
	
	
}
