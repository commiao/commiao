package com.commiao.basic.business.tools.common;

import org.apache.commons.lang.StringUtils;


/**
 * 综合业务平台api工具类
 * @author wrx
 *
 */
public class InfoCenterApiUtil {
	/**
	 * 积分方向代码转译
	 * @param pointDirection
	 * @return
	 */
	public static String pointDirectionToDesc(String pointDirection){
		String desc=null;
		switch (pointDirection) {
		case "1":
			desc="增加积分";
			break;
		case "0":
			desc="消费积分";
			break;
		}
		return desc;
	}
	/**
	 * 积分方向代码转译---APP
	 * @param pointDirection
	 * @return
	 */
	public static String pointDirectionToDescApp(String pointDirection){
		String desc=null;
		switch (pointDirection) {
		case "1":
			desc="新增积分";
			break;
		case "0":
			desc="扣减积分";
			break;
		}
		return desc;
	}
	
	
	/**
	 * 积分方向代码转译方式2
	 * @param pointDirection
	 * @return
	 */
	public static String pointDirectionToSymbol(String pointDirection){
		String desc=null;
		switch (pointDirection) {
		case "1":
			desc="+";
			break;
		case "0":
			desc="-";
			break;
		}
		return desc;
	}
	
	/**
	 * 根据总数和查询条数计算页数 
	 * @param total
	 * @param pageSize
	 * @return
	 */
	public static String getTotalPage(String total,String pageSize){
   	 int totalPageNum = 0;
   	 if(StringUtils.isNotBlank(total)&&StringUtils.isNotBlank(pageSize)){
   		totalPageNum = (Integer.parseInt(total)  +  Integer.parseInt(pageSize)  - 1) / Integer.parseInt(pageSize);
   	 }
   	 return String.valueOf(totalPageNum);
	}
}
