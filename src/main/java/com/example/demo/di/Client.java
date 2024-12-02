package com.example.demo.di;

public class Client implements InjectionMessage {
	private MessageService messageService;

	/*
		// constructor injection
		public Client(MessageService messageService) {
			this.messageService = messageService;
		}
		// setter injection
		public void setMessageService(MessageService messageServiceParam) {
			this.messageService = messageServiceParam;
		}
	*/
	@Override
	public void setService(MessageService service) {
		this.messageService = service;
	}

	public void processMessage(String message) {
		messageService.sendMessage(message);
	}


}
