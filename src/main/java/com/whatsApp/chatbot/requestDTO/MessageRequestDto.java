package com.whatsApp.chatbot.requestDTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class MessageRequestDto {
    private String from;
    private String message;


}
