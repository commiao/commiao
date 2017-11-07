package basic.arch.component.activeMQ;

import javax.jms.Destination;

public interface AmqSenderService {

	/** 
	 * @Description::(向特定的队列发送消息). <br/> 
	 * @author jingmiao
	 * @param destination
	 * @param message
	 */ 
	void sendMsg(Destination destination, String message);
	
}
