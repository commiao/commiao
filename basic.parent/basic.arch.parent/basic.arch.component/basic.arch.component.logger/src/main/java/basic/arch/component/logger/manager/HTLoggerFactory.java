package basic.arch.component.logger.manager;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import basic.arch.component.logger.bean.Group;
import basic.arch.component.logger.bean.JarInfo;
import basic.arch.component.logger.handler.HTLogger;
import basic.arch.component.logger.handler.HTLoggerImpl;

/**
 * 日志工厂
 * 
 * @author jannal
 */
public class HTLoggerFactory extends AbstrctLoggerFactory {

    private static final ConcurrentMap<String, Group> LOGGERS = new ConcurrentHashMap<String, Group>();

    private HTLoggerFactory() {
    }

    public static HTLogger getLogger(Class<?> key) {

        Group group = LOGGERS.get(key.getName());
        if (group == null) {
            LOGGERS.putIfAbsent(key.getName(), new Group(key.getName()));
            group = LOGGERS.get(key.getName());
        }
        group.setType("logger");
        JarInfo jarInfo = getJarInfo(key);
        group.setJarInfo(jarInfo);
        HTLogger logger = new HTLoggerImpl(group);
        return logger;
    }

    public static HTLogger getLogger(String key) {
        Group group = LOGGERS.get(key);
        if (group == null) {
            LOGGERS.putIfAbsent(key, new Group(key));
            group = LOGGERS.get(key);
        }
        group.setType("logger");
        Class<?> forName;
        JarInfo jarInfo = null;
        try {
            forName = Class.forName(key);
            jarInfo = getJarInfo(forName);
        } catch (ClassNotFoundException e) {
        }
        group.setJarInfo(jarInfo);
        HTLogger logger = new HTLoggerImpl(group);
        return logger;
    }

}
