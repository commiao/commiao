package basic.arch.component.activeMQ;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service("amqReceiveService")
public class AmqReceiveServiceImpl implements AmqReceiveService{

    private static final Logger logger = LoggerFactory.getLogger(AmqReceiveServiceImpl.class);

    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;
    
    /** 
     * 从特定的队列接收消息. 
     * @see basic.arch.component.activeMQ.AmqSenderService#receive(javax.jms.Destination) 
     */  
    @Override
	public TextMessage receive(Destination destination) {
		TextMessage tm = (TextMessage) jmsTemplate.receive(destination);
		if (tm != null) {
			try {
				logger.info("Get Message:{},from Destination{}。",tm.getText(),destination.toString());
			} catch (JMSException e) {
				logger.error("从队列{}接收消息失败", destination);
			}
		}
		return tm;
	}
	
}
