package com.commiao.sdk.controller.common.utils;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import com.commiao.basic.business.tools.exception.ValidateParamsException;
import com.commiao.sdk.controller.common.constant.CommonConstant;

import basic.arch.tools.utils.common.BigdataConstants;
import core.service.ServiceResponseBody;

/**
 * CreateDate:2017年3月21日下午7:21:28
 * 
 * @Description: 公共校验类
 * @author:hehch
 * @version V1.0
 */
public class CommonVerifyUtils {

	/**
	 * @Description::(校验图文验证码). <br/>
	 * @author hehch
	 * @param imgCode
	 * @param session
	 * @throws ValidateParamsException
	 */
	public static void verifyImgCode(String imgCode, HttpSession session) throws ValidateParamsException {
		String validateCodeServer = (String) session.getAttribute(BigdataConstants.REGISTER_VALIDATE_CODE);
		if (StringUtils.isNotEmpty(validateCodeServer) && StringUtils.isNotEmpty(imgCode)
				&& imgCode.length() == BigdataConstants.IMAGE_CODE_LENGTH
				&& validateCodeServer.equalsIgnoreCase(imgCode)) {
		} else {
			session.removeAttribute(BigdataConstants.REGISTER_VALIDATE_CODE);
			throw new ValidateParamsException(ServiceResponseBody.FAILED, CommonConstant.FAILED_IMG_CODE, "图文验证码输入错误");
		}
	}
}
