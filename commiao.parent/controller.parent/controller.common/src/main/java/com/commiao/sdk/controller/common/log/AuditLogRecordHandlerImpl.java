package com.commiao.sdk.controller.common.log;

import java.util.TreeMap;

import com.alibaba.fastjson.JSONObject;

import base.arch.component.auditLogger.handler.AuditLogRecordHandler;
import base.arch.component.logger.handler.HTLogger;
import base.arch.component.logger.manager.HTAuditLoggerFactory;
import base.arch.component.logger.util.concurrent.LoggerInfo;
import base.arch.component.logger.util.concurrent.LoggerThreadContext;

public class AuditLogRecordHandlerImpl implements AuditLogRecordHandler{
    private HTLogger logger =HTAuditLoggerFactory.getLogger(AuditLogRecordHandlerImpl.class);
    
    
    @Override
    public void doRecord(TreeMap<String, Object> treeMap) {
        LoggerInfo loggerInfo = LoggerThreadContext.get();
        treeMap.put("threadId", loggerInfo.getThreadId());
        logger.info(JSONObject.toJSONString(treeMap));
        
    }

}
