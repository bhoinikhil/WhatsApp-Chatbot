package com.whatsApp.chatbot.serviceImpl;

import com.whatsApp.chatbot.entity.Message;
import com.whatsApp.chatbot.repository.MessageRepository;
import com.whatsApp.chatbot.requestDTO.MessageRequestDto;
import com.whatsApp.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatbotServiceImpl implements ChatbotService {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public String handleProcess(MessageRequestDto messageRequestDto) {
        String msg = messageRequestDto.getMessage();
        String reply;
        if(msg == null){
            reply = "Invalid message!";
        }else {
            switch (msg.toLowerCase()) {
                case "hi":
                    reply = "Hello";
                    break;
                case "bye":
                    reply="goodbye";
                    break;
                default:
                    reply = "I didn't understand your message!";
            }
        }

        Message entity = new Message();
        entity.setSender(messageRequestDto.getFrom());
        entity.setReply(reply);
        messageRepository.save(entity);

        return reply;
    }
}
