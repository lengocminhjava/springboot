package com.example.demo.iocAndBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Boy boy() {
		return new Boy();
	}
}
