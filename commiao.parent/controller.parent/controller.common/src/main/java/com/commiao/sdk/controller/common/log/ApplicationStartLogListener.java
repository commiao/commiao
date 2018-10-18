package com.commiao.sdk.controller.common.log;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.commiao.basic.business.tools.common.DateUtils;

import base.arch.component.logger.bean.JarInfo;
import base.arch.component.logger.bean.WarInfo;
import base.arch.component.logger.handler.HTLogger;
import base.arch.component.logger.manager.HTAuditLoggerFactory;

@Component
public class ApplicationStartLogListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getDisplayName().equals("WebApplicationContext for namespace 'springmvc-servlet'")) {
            Resource resource = event.getApplicationContext().getResource("/META-INF/MANIFEST.MF");
            try {
                InputStream inputStream = resource.getInputStream();
                Manifest manifest = new Manifest(inputStream);
                if (manifest != null) {
                    Attributes mainAttributes = manifest.getMainAttributes();
                    WarInfo warInfo = new WarInfo();
                    if (mainAttributes != null) {
                        warInfo.setBuildTime(mainAttributes.getValue("Build-Time"));
                        warInfo.setStartCompleteTime(DateUtils.getCurrentDayTime24Formatt());
                        HTLogger logger = HTAuditLoggerFactory.getLoggerWar(ApplicationStartLogListener.class,warInfo);
                        logger.info(JSON.toJSONString(warInfo));
                    }
                }

            } catch (IOException e) {
            }

        }

    }

}
