package com.commiao.sdk.controller.common.utils;

import java.lang.reflect.Method;
import java.util.List;

import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.manager.HTLoggerFactory;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;
import com.commiao.sdk.controller.common.domain.PageBeanResult;

/** 
 * CreateDate:2017年3月23日上午9:49:49 
 * @Description: 恒生接口返回列表转PageBeanResult对象  
 * @author:jingmiao
 * @version V1.0   
 */
public class PofHsPageBeanResultUtils {
	
	static final HTLogger logger = HTLoggerFactory.getLogger(PofHsPageBeanResultUtils.class);
	
	/** 
	 * @Description::List<T>转PageBeanResult<T>对象. <br/> 
	 * @author jingmiao
	 * @param list
	 * @param pageCurrent
	 * @param pageSize
	 * @param totalCount
	 * @return
	 */ 
	public static <T>PageBeanResult<T> getPageBeanResult(List<T> list,int pageCurrent,int pageSize,int totalCount){

		PageBeanResult<T> pageResult = new PageBeanResult<T>();
		Paginator paginator = null;
		if(list.size()>0){
			paginator = new Paginator(pageCurrent, pageSize, totalCount);
		}else{
			paginator = new Paginator(pageCurrent, pageSize, 0);
		}
		PageList<T> resultList = new PageList<T>(paginator);
		resultList.addAll(list);
		pageResult.setPageList(resultList);
		
		return pageResult;
	}
	
	
	private static Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {  
        Class<? extends Object> ownerClass = owner.getClass();  
        methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);  
        Method method = null;  
        try {  
            method = ownerClass.getMethod("get" + methodName);  
        } catch (SecurityException e) {  
        	logger.error(e);
        } catch (NoSuchMethodException e) {  
        	logger.error(e);
            return " can't find 'get" + methodName + "' method";  
        }  
        return method.invoke(owner);  
    } 
	
	@SuppressWarnings("unused")
	private static <T>int getTotal(T t){
		int total = 0;
		if(t==null){
			return total;
		}
		try {
			Object obj = invokeMethod(t, "TotalCount", null);
			if(obj!=null){
				total = Integer.parseInt(obj.toString());
			}
		} catch (Exception e) {
			total = -1;
			e.printStackTrace();
		}
		return total;
	}
	
}
