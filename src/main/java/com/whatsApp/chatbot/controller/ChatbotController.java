package com.whatsApp.chatbot.controller;

import com.whatsApp.chatbot.requestDTO.MessageRequestDto;
import com.whatsApp.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class ChatbotController {
    @Autowired
    ChatbotService chatbotService;

    @PostMapping
    public Map<String, String> handleRequest(@RequestBody MessageRequestDto messageRequestDto) {
        String reply = chatbotService.handleProcess(messageRequestDto);
        //logs
        System.out.println("User: "+ messageRequestDto.getFrom());
        System.out.println("Message: "+ messageRequestDto.getMessage());
        System.out.println("Reply: "+ reply);

        Map<String, String> map = new HashMap<String, String>();
        map.put("reply", reply);
        return map;
    }

}
