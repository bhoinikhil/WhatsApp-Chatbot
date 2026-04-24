package com.whatsApp.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotApplication {

	public static void main(String[] args) {
        System.out.println("Application starting...");
		SpringApplication.run(ChatbotApplication.class, args);
        System.out.println("Application Started Successfully");
	}

}
