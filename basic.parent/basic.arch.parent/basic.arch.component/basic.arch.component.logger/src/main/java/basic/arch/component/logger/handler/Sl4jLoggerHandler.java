package basic.arch.component.logger.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basic.arch.component.logger.bean.Group;
import basic.arch.component.logger.bean.HTLevel;
/**
 * slf4日志处理器
 * @author jannal
 */
public class Sl4jLoggerHandler implements ILoggerHandler {

    @Override
    public void handle(Group group) {
        Logger logger = LoggerFactory.getLogger(group.getName());
        if(group.getLevel()!=null&&group.getLevel().equals(HTLevel.INFO)){
            logger.info(group.getMessage(),group.getThrowable());
        }else if(group.getLevel()!=null&&group.getLevel().equals(HTLevel.ERROR)){
            logger.error(group.getMessage(),group.getThrowable());
        }else if(group.getLevel()!=null&&group.getLevel().equals(HTLevel.DEBUG)){
            logger.error(group.getMessage(),group.getThrowable());
        }else if(group.getLevel()!=null&&group.getLevel().equals(HTLevel.WARN)){
            logger.error(group.getMessage(),group.getThrowable());
        }
    }

}
