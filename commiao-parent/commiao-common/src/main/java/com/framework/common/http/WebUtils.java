package com.framework.common.http;

import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebUtils {
	private final static Logger LOG = LoggerFactory.getLogger(WebUtils.class);

	public static String sendHttp(String url, Map<String, String> parameters)
			throws Exception {
		String outStr = "";
		try {
			String charSet = "UTF-8";
			String timeOut = "50000";// 自行配置
			outStr = HttpCommonClientHelper.doHttp(url, charSet, parameters, timeOut);
			if (outStr == null) {
				throw new Exception("请求接口失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("请求接口失败!");
		}
		return outStr;
	}

	/**
	 * IPS SOAP 请求实时发送请求实时发送
	 * 
	 */
	public static String sendHttpSoap(String url,
			Map<String, String> parameters, String mothodName, String retMethod)
			throws Exception {
		String soapResponData = "";
		try {
			String soapRequestData = buildRequestData(parameters, mothodName);
			LOG.info("soapRequestData=[{}]", soapRequestData);
			soapResponData = HttpCommonClientHelper.doPostSoap(url, soapRequestData,retMethod);
			LOG.info("soapRequestData=[{}]", soapResponData);
			if (soapResponData == null) {
				throw new Exception("请求接口失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("请求接口失败!");
		}

		return soapResponData;

	}

	private static String buildRequestData(Map<String, String> patameterMap,String methodName) {
		StringBuffer soapRequestData = new StringBuffer();
		soapRequestData.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		soapRequestData.append("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">");
		soapRequestData.append("<soap12:Body>");
		soapRequestData.append("<" + methodName + " xmlns=\"http://tempuri.org/\">");
		Set<String> nameSet = patameterMap.keySet();
		for (String name : nameSet) {
			soapRequestData.append("<" + name + ">" + patameterMap.get(name) + "</" + name + ">");
		}
		soapRequestData.append("</" + methodName + ">");
		soapRequestData.append("</soap12:Body>");
		soapRequestData.append("</soap12:Envelope>");
		return soapRequestData.toString();
	}
}