package basic.arch.tools.utils.common.exception;


/***
 * 封装所有查询异常
 * @author jannal
 */
public class DataQueryRuntimeException extends DataCommonRuntimeException {

	private static final long serialVersionUID = 1L;

	public DataQueryRuntimeException() {
		super();
	}

	public DataQueryRuntimeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataQueryRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataQueryRuntimeException(String message) {
		super(message);
	}

	public DataQueryRuntimeException(Throwable cause) {
		super(cause);
	}
	
}
