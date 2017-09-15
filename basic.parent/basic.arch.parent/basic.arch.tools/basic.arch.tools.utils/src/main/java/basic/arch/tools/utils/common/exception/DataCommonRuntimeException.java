package basic.arch.tools.utils.common.exception;


/**
 * 业务通用的运行时异常
 * @author jannal
 */
public class DataCommonRuntimeException extends RuntimeException{
    private static final long serialVersionUID = 141393606218344376L;

    public DataCommonRuntimeException() {
        super();
    }

    public DataCommonRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataCommonRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataCommonRuntimeException(String message) {
        super(message);
    }

    public DataCommonRuntimeException(Throwable cause) {
        super(cause);
    }

    
}
