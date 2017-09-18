package com.commiao.basic.business.tools.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * 信息中心url配置
 * @author wrx
 *
 */
@Component
public class InfoCenterConfig {
    /**信息中心服务器地址*/   //http://172.16.162.190:8080
    @Value("${htmall.infoCenter.path}")
    private String infoCenterBaseUrl;
    
    /**积分余额url
     *           /api/public/point/balance
     * */   
    @Value("${infocenter.memberPoint.url}")
    private String memberPointUrl;

    /**用户等级url
     * 			
     * */
    @Value("${infocenter.memberTier.url}")
    private String memberTierUrl;

    /**当月到期积分url*/
    @Value("${infocenter.expireThisMonth.url}")
    private String expireThisMonthUrl;
  
    /**积分列表url*/
    @Value("${infocenter.pointList.url}")
    private String pointListUrl;
    
    /**头像文件路径url*/
    @Value("${infocenter.photo.url}")
    private String photoUrl;

	public String getPointListUrl() {
		return pointListUrl;
	}

	public String getExpireThisMonthUrl() {
		return expireThisMonthUrl;
	}

	public String getMemberTierUrl() {
		return memberTierUrl;
	}

	public String getInfoCenterBaseUrl() {
		return infoCenterBaseUrl;
	}

	public String getMemberPointUrl() {
		return memberPointUrl;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}
	
}
