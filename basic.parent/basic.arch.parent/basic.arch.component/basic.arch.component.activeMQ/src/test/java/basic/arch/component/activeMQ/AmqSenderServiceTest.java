package basic.arch.component.activeMQ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-all.xml" })
public class AmqSenderServiceTest{

	@Autowired
	private AmqSenderService amqSenderService;
	
	@Test
	public void testsendMsg(){
		amqSenderService.sendMsg("测试MQ队列########################");
		System.out.println("执行完成");
	}
	
	@Test
	public void test(){
		
	}
	
}
