package core.inteface;

import java.io.Serializable;
/**
 * CreateDate:2016年9月13日下午4:19:11 
 * @Description: 公募集接口请求对象  
 * @author:jannal
 * @version V1.0
 */
public class InterfaceRequest<T> implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private T params;

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

}
