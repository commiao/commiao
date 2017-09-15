package basic.arch.component.logger.handler;

import basic.arch.component.logger.bean.Group;

/**
 * 日志处理器接口
 * @author jannal
 */
public interface ILoggerHandler {

    public void handle(Group group);
    
}
