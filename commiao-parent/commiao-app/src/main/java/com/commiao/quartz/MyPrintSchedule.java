package com.commiao.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 只是测试一下 定时任务而已
 * @author zhengjinping
 * 2015-12-31 上午11:19:32
 *
 */
public class MyPrintSchedule {
	
	private static final Logger logger = Logger.getLogger(MyPrintSchedule.class);
	
	public static void printSomething() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		logger.info(df.format(new Date())+":打印一些定时任务test东西而已！");
	}
}
