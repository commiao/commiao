package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年2月13日下午6:20:39 
 * @Description: 电子合同config配置项
 * @author:shl
 * @version V1.0   
 */
@Component
public class ElectronicContractConfig {
	/***
	 * 签名加密方法
	 */
	@Value("${electronic.contract.signmethod}")
	private String signMethod;
	/**
	 * 渠道编号
	 */
	@Value("${electronic.contract.companyid}")
	private String companyId;
	/**
	 * 秘钥
	 */
	@Value("${electronic.contract.key}")
	private String key;
	/**
	 * 招商证券接口服务地址
	 */
	@Value("${electronic.contract.url}")
	private String url;
	/**
	 * 电子合同查询URL
	 */
	@Value("${htmall.electronic.query.url}")
	private String electronicQueryUrl;
	/**
	 * 签署电子合同URL
	 */
	@Value("${htmall.electronic.contract.url}")
	private String signEleContractUrl;

	public String getSignMethod() {
		return signMethod;
	}

	public String getCompanyId() {
		return companyId;
	}

	public String getKey() {
		return key;
	}

	public String getUrl() {
		return url;
	}

	public String getElectronicQueryUrl() {
		return electronicQueryUrl;
	}

	public String getSignEleContractUrl() {
		return signEleContractUrl;
	}
}
