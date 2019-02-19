package com.great.dubbo.comsumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.great.dubbo.comsumer.service.IHomeService;
import com.great.dubbo.comsumer.service.impl.HomServiceImpl;

/**
 * 
 * @author 消费者处理类
 *
 */
public class ApplicationConsumer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
		IHomeService homeService = ac.getBean(HomServiceImpl.class);
		homeService.getMoreUserInfo("");
		System.out.println("==>获取单个");
		homeService.getMoreUserInfo("1");
		System.out.println("==>调用完成");
		System.in.read();
	}
}
