package basic.arch.component.activeMQ;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

@Service("amqSenderService")
public class AmqSenderServiceImpl implements AmqSenderService{

    private static final Logger logger = LoggerFactory.getLogger(AmqSenderServiceImpl.class);

    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;


    /** 
     * 向特定的队列发送消息. 
     * @see basic.arch.component.activeMQ.AmqSenderService#sendMsg(javax.jms.Destination, java.lang.String) 
     */  
    @Override
    public void sendMsg(Destination destination, String message) {
        final String msg = JSON.toJSONString(message);
        try {
            logger.info("将要向队列{}发送的消息msg:{}", destination, msg);
            jmsTemplate.send(destination, new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage(msg);
                }
            });

        } catch (Exception ex) {
            logger.error("向队列{}发送消息失败，消息为：{}", destination, msg);
        }

    }

}
