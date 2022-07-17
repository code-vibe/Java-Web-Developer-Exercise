package com.udacity.jwdnd.cl.review;

import com.udacity.jwdnd.cl.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message() {
		System.out.println("Creating a Bean");
		return "Hello, Spring!!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService) {
		System.out.println("Creating UppercaseMessage Bean");
		return message().toUpperCase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService) {
		System.out.println("Creating UppercaseMessage Bean");
		return message().toLowerCase();
	}
}
