package com.commiao.sdk.controller.common.log;

import java.util.TreeMap;

import com.alibaba.fastjson.JSONObject;

import basic.arch.component.auditLogger.handler.AuditLogRecordHandler;
import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.manager.HTAuditLoggerFactory;
import basic.arch.component.logger.util.concurrent.LoggerInfo;
import basic.arch.component.logger.util.concurrent.LoggerThreadContext;

public class AuditLogRecordHandlerImpl implements AuditLogRecordHandler{
    private HTLogger logger =HTAuditLoggerFactory.getLogger(AuditLogRecordHandlerImpl.class);
    
    
    @Override
    public void doRecord(TreeMap<String, Object> treeMap) {
        LoggerInfo loggerInfo = LoggerThreadContext.get();
        treeMap.put("threadId", loggerInfo.getThreadId());
        logger.info(JSONObject.toJSONString(treeMap));
        
    }

}
