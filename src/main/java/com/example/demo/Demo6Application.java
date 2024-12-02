package com.example.demo;

import com.example.demo.iocAndBeans.Boy;
import com.example.demo.iocAndBeans.Clients;
import com.example.demo.iocAndBeans.EmailServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo6Application.class, args);
		EmailServices emailServices = context.getBean(EmailServices.class);
		Clients clients = context.getBean(Clients.class);
		emailServices.sendMessage("Hello World");
		clients.process("Hello World clients");
		Boy boy = context.getBean(Boy.class);
		System.out.println(boy);
	}

}
