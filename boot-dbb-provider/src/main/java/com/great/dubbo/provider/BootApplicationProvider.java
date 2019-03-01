package com.great.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 生产者启动类
 * 
 * @author Roc
 *
 */
@EnableDubbo
@SpringBootApplication
public class BootApplicationProvider {
	public static void main(String[] args) {
		SpringApplication.run(BootApplicationProvider.class, args);
	}
}
