package com.commiao.basic.business.tools.config.pof;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 
 * CreateDate:2017年6月25日下午4:37:11 
 * @Description: 获取私募请求接口url
 * @author:jingmiao
 * @version V1.0   
 */
@Component
public class PofPefUrlConfig {
	
	/**
	 * 获取金服接口地址 htjf.baseUrl. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_BASE_URL
	 */
	@Value("${htjf.baseUrl}")
	private String htjfInterfaceBaseUrl;
	/**
	 * 公募热销产品接口 htjf.fund.hotSale. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_HOTSALE_URI
	 */
	@Value("${htjf.fund.hotSale}")
	private String htjfInterfaceFundHotSaleUrl;
	/**
	 * 公募产品推荐接口 htjf.fund.recommend. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_RECOMMEND_URI
	 */
	@Value("${htjf.fund.recommend}")
	private String htjfInterfaceFundRecommendUrl;
	/**
	 * 产品推荐接口 htjf.pof.recommend. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_POF_RECOMMEND_URI
	 */
	@Value("${htjf.pof.recommend}")
	private String htjfInterfacePofRecommendUrl;
	/**
	 * 基金组合配置信息接口 htjf.portfolio.product. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_PORTFOLIO_PRODUCT_URI
	 */
	@Value("${htjf.portfolio.product}")
	private String htjfInterfacePortfolioProductUrl;
	/**
	 * 基金组合类型信息接口 htjf.fund.portfolio. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_PORTFOLIO_URI
	 */
	@Value("${htjf.fund.portfolio}")
	private String htjfInterfaceFundPortfolioUrl;
	/**
	 * 公募银行信息接口 htjf.bank.info. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_BANK_INFO_URI
	 */
	@Value("${htjf.bank.info}")
	private String htjfInterfaceBnakInfoUrl;
	/**
	 * 公募团队信息接口 htjf.team.info. <br/>
	 * POF_INTERFACE_PROPERTIES_KEY_HTJF_TEAM_INFO_URI
	 */
	@Value("${htjf.team.info}")
	private String htjfInterfaceTeamInfoUrl;
	
	
	
	/**
	 * 获取 获取金服接口地址 htjf.baseUrl. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_BASE_URL
	 * @return the htjfInterfaceBaseUrl
	 */
	public String getHtjfInterfaceBaseUrl() {
		return htjfInterfaceBaseUrl;
	}
	/**
	 * 获取 公募热销产品接口 htjf.fund.hotSale. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_HOTSALE_URI
	 * @return the htjfInterfaceFundHotSaleUrl
	 */
	public String getHtjfInterfaceFundHotSaleUrl() {
		return htjfInterfaceFundHotSaleUrl;
	}
	/**
	 * 获取 公募产品推荐接口 htjf.fund.recommend. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_RECOMMEND_URI
	 * @return the htjfInterfaceFundRecommendUrl
	 */
	public String getHtjfInterfaceFundRecommendUrl() {
		return htjfInterfaceFundRecommendUrl;
	}
	/**
	 * 获取 产品推荐接口 htjf.pof.recommend. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_POF_RECOMMEND_URI
	 * @return the htjfInterfacePofRecommendUrl
	 */
	public String getHtjfInterfacePofRecommendUrl() {
		return htjfInterfacePofRecommendUrl;
	}
	/**
	 * 获取 基金组合配置信息接口 htjf.portfolio.product. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_PORTFOLIO_PRODUCT_URI
	 * @return the htjfInterfacePortfolioProductUrl
	 */
	public String getHtjfInterfacePortfolioProductUrl() {
		return htjfInterfacePortfolioProductUrl;
	}
	/**
	 * 获取 基金组合类型信息接口 htjf.fund.portfolio. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_FUND_PORTFOLIO_URI
	 * @return the htjfInterfaceFundPortfolioUrl
	 */
	public String getHtjfInterfaceFundPortfolioUrl() {
		return htjfInterfaceFundPortfolioUrl;
	}
	/**
	 * 获取 公募银行信息接口 htjf.bank.info. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_BANK_INFO_URI
	 * @return the htjfInterfaceBnakInfoUrl
	 */
	public String getHtjfInterfaceBnakInfoUrl() {
		return htjfInterfaceBnakInfoUrl;
	}
	/**
	 * 获取 公募团队信息接口 htjf.team.info. <br>  POF_INTERFACE_PROPERTIES_KEY_HTJF_TEAM_INFO_URI
	 * @return the htjfInterfaceTeamInfoUrl
	 */
	public String getHtjfInterfaceTeamInfoUrl() {
		return htjfInterfaceTeamInfoUrl;
	}

}
