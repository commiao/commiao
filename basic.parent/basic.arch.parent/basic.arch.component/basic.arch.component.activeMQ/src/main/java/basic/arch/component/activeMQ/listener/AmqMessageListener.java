package basic.arch.component.activeMQ.listener;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import com.alibaba.fastjson.JSON;

public class AmqMessageListener implements MessageListener{
    
	/** 
	 * 监听队列信息. 
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message) 
	 */  
	@Override
    public void onMessage(Message message) {
		/**  
         * 接受文本类型的消息  
         */
        if (message instanceof TextMessage) {
        	TextMessage txtMsg = (TextMessage) message;
            try {
                String msg = txtMsg.getText();
                //实际项目中拿到String类型的message(通常是JSON字符串)之后，
                //会进行反序列化成对象，做进一步的处理
                System.out.println("listen txt msg===" + JSON.toJSONString(msg));
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }
        
        
        /**  
         * 接受Map类型的消息  
         */  
        if(message instanceof MapMessage){  
            MapMessage map = (MapMessage) message;  
            System.out.println("listen map msg===" + JSON.toJSONString(map));  
        } 
        
        /**  
         * 接受object类型的消息  
         */
        if(message instanceof ObjectMessage){  
            ObjectMessage objMsg = (ObjectMessage) message;  
            try {  
                Object obj = objMsg.getObject();  
                System.out.println("listen object msg===" + JSON.toJSONString(obj));  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        } 
        
    }
	
}
