package com.great.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author 生产者启动类
 *
 */
public class ApplicationProvider {
	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("provider.xml");
		ac.start();
		System.in.read();
	}
}
