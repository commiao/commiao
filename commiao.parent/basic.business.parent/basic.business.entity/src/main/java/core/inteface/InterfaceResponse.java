package core.inteface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateDate:2016年9月13日下午4:19:32 
 * @Description: 公募接口响应对象  
 * @author:jannal
 * @version V1.0
 */
public class InterfaceResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<T> dataList = new ArrayList<T>();

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

}
