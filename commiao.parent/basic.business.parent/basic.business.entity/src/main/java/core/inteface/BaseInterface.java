package core.inteface;

import core.entity.RequestGenericity;
import core.entity.ResponseGenericity;

/**
 * 
 * CreateDate:2016年9月19日上午9:50:45 
 * @Description: 封装恒生接口——对外公开的调用接口
 * @author:yuzhao
 * @version V1.0
 */
public interface BaseInterface<T extends RequestGenericity, K extends ResponseGenericity> {

	/**
	 * 
	 * @Description::公募基金接口调用. <br/> 
	 * @author yuzhao
	 * @param request
	 * @return
	 */
	InterfaceResponse<K> execute(InterfaceRequest<T> request);
	
}
