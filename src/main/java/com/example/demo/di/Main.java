package com.example.demo.di;

public class Main {
	public static void main(String[] args) {
		EmailService emailService = new EmailService();
		SMSService smsService = new SMSService();
		Client client = new Client();
        client.setService(emailService);
		client.processMessage("Hello World");
	}

}
