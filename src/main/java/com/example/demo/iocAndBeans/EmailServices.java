package com.example.demo.iocAndBeans;

import org.springframework.stereotype.Component;

@Component
public class EmailServices implements MessageServices {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending email to " + message);
	}
}
