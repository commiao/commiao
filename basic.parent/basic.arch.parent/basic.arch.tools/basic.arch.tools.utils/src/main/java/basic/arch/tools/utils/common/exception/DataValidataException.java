package basic.arch.tools.utils.common.exception;

public class DataValidataException  extends DataCommonRuntimeException{

    private static final long serialVersionUID = -5299498292042741021L;

    public DataValidataException() {
        super();
    }

    public DataValidataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataValidataException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidataException(String message) {
        super(message);
    }

    public DataValidataException(Throwable cause) {
        super(cause);
    }
	

}
