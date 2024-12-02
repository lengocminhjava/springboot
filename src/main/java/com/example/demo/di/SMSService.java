package com.example.demo.di;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS " + message);
	}
}
