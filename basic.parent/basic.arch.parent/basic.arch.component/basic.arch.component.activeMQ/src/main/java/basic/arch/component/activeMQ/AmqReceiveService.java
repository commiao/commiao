package basic.arch.component.activeMQ;

import javax.jms.Destination;
import javax.jms.TextMessage;

public interface AmqReceiveService {

	/** 
	 * @Description::(从特定的队列接收消息). <br/> 
	 * @author jingmiao
	 * @param destination
	 * @return
	 */ 
	TextMessage receive(Destination destination);
	
}
