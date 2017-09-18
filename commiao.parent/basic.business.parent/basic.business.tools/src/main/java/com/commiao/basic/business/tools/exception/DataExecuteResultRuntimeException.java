package com.commiao.basic.business.tools.exception;



/**
 * 自定义数据插入、更新、删除异常
 * @author jannal
 */
public class DataExecuteResultRuntimeException extends DataCommonRuntimeException{

    private static final long serialVersionUID = 4589855316236151130L;

    public DataExecuteResultRuntimeException() {
        super();
    }
    
    public DataExecuteResultRuntimeException(String task,int resultSize) {
        super(task + "操作期望返回的结果是1,实际是"+resultSize);
    }

    public DataExecuteResultRuntimeException(String task,int expectSize, int resultSize) {
        super(task + "操作期望返回的结果是"+expectSize+",实际是"+resultSize);
    }
    
    public DataExecuteResultRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataExecuteResultRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    
    
    public DataExecuteResultRuntimeException(String message) {
        super(message);
    }

    public DataExecuteResultRuntimeException(Throwable cause) {
        super(cause);
    }


    
}
