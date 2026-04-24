package com.whatsApp.chatbot.controller;

import com.whatsApp.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {
    @Autowired
    ChatbotService chatbotService;
}
