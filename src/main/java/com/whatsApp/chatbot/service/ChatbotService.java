package com.whatsApp.chatbot.service;

import com.whatsApp.chatbot.requestDTO.MessageRequestDto;

public interface ChatbotService {
    public String handleProcess(MessageRequestDto messageRequestDto);
}
