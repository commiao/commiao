package basic.arch.component.auditLogger.interceptor;

import basic.arch.component.auditLogger.stereotype.AuditLog;
import basic.arch.component.auditLogger.stereotype.AuditLogInfo;

public interface AuditLogInterceptor {

	public void beforeRecord(AuditLogInfo auditLogInfo,AuditLog al);
	
	public void throwExceptionRecord(AuditLogInfo auditLogInfo,Exception e);
	
	public void afterRecord(AuditLogInfo auditLogInfo);
}
