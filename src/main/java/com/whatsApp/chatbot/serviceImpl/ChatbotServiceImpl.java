package com.whatsApp.chatbot.serviceImpl;

import com.whatsApp.chatbot.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatbotServiceImpl {

    @Autowired
    MessageRepository messageRepository;
}
