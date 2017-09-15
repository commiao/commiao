package basic.arch.component.exception.utils;

import basic.arch.component.exception.ServiceException;
import basic.arch.component.exception.SystemServiceException;
import basic.arch.component.exception.UnifiedException;
import basic.arch.component.exception.api.ExceptionManager;

public class ExceptionHandleUtils {
	
	public static void  handle(Exception ex,ExceptionManager exceptionManager){
		if(exceptionManager != null){
			if(ex instanceof UnifiedException) {
				UnifiedException ue = (UnifiedException) ex;
				ue.setBusinessModule("ExceptionHandleUtils");
				ue.setErrorCode("S9999");
				exceptionManager.publish(ue);
			} else if (ex instanceof ServiceException) {
				ServiceException se = (ServiceException)ex;
				exceptionManager.publish(se.getDescription(),"ExceptionHandleUtils", "S99999", ex);
			}else{
				exceptionManager.publish(ex.getMessage(), "ExceptionHandleUtils",SystemServiceException.SYS_ERROR_CODING , ex);
				
			}
		}else{
			
		}

	}
	 
}
