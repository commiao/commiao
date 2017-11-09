package basic.arch.component.activeMQ;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.TextMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-all.xml" })
public class AmqReceiveServiceTest {

    //目的地队列的明证，我们要向这个队列发送消息
    @Resource(name = "destinationQueue")
    private Destination destination;
	
	@Autowired
	private AmqReceiveService amqReceiveService;
	
	@Test
	public void testreceive() throws InterruptedException{
		TextMessage tm = null;
		while(true){
			tm = amqReceiveService.receive(destination);
			if(tm==null){
				break;
			}
		}
		System.out.println("执行接收信息完成");
	}	
	
}
