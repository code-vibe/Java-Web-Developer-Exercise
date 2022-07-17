package com.udacity.jwdnd.cl.review.service;

import com.udacity.jwdnd.cl.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<ChatMessage>  chatMessages;
    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }
}
