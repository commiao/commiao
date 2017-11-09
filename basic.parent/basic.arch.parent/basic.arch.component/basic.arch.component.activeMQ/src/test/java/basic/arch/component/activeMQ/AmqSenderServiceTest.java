package basic.arch.component.activeMQ;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-all.xml" })
public class AmqSenderServiceTest{

    //目的地队列的明证，我们要向这个队列发送消息
    @Resource(name = "destinationQueue")
    private Destination destination;
	
	@Autowired
	private AmqSenderService amqSenderService;
	
	@Test
	public void testsendMsg() throws InterruptedException{
		for(int i=6;i<11;i++){
			Thread.sleep(1000);
			amqSenderService.sendMsg(destination, "测试MQ队列########################+"+i);
		}
		System.out.println("执行发送信息完成");
	}
}
