package com.chtwm.mall.core.util;

import org.apache.commons.lang3.StringUtils;

import com.commiao.basic.business.tools.common.constant.BigdataConstants;
import com.commiao.basic.business.tools.common.constant.GlobalResultCode;
import com.commiao.basic.business.tools.exception.ValidateParamsException;
import com.commiao.basic.business.tools.validate.NumberValidationUtils;

/** 
 * CreateDate:2017年6月2日上午11:27:14 
 * @Description: 字符串处理utils
 * @author:shl
 * @version V1.0   
 */
public class HStringUtils {
	
	/**
	 * 
	 * @Description:stringsToLongs
	 *    例如:1,2,3,4转为Long数组
	 * @author shl
	 * @param idsStr
	 * @param msg
	 * @return
	 * @throws ValidateParamsException
	 */
	public static Long[] stringsToLongs(String idsStr) throws ValidateParamsException {
		if(StringUtils.isBlank(idsStr)){
			return null;
		}
        String[] ids = idsStr.split(",");
        Long[] idsLong = new Long[ids.length];
        for(int i=0;i<ids.length;i++){
            if(NumberValidationUtils.isLongNumeric(ids[i])){
                idsLong[i] =  Long.valueOf(ids[i]);
            }else{
                idsLong = null;
                throw new ValidateParamsException("ids参数格式不正确", GlobalResultCode.CommonResultCode.PARAMS_ILLEGAL);
            }
        }
        return idsLong;
    }
}
