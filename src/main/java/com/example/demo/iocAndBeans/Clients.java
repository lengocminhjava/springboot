package com.example.demo.iocAndBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Clients {
	@Autowired
	private MessageServices messageServices;

	public void process(String message) {
		messageServices.sendMessage(message);
	}


}
