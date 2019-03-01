package com.great.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 消费者启动类
 * 
 * @author Roc
 *
 */
@EnableDubbo
@SpringBootApplication
public class BootApplicationConsumer {
	public static void main(String[] args) {
		SpringApplication.run(BootApplicationConsumer.class, args);
	}
}
