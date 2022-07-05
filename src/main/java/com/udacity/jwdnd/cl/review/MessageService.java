package com.udacity.jwdnd.cl.review;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {
    private String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String uppercase() {
        System.out.println("Creating UppercaseMessage Bean");
        return this.message.toUpperCase();
    }
    public String lowercase() {
        System.out.println("Creating LowercaseMessage bean");
        return  this.message.toLowerCase();
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }
}
