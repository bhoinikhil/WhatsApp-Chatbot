package com.whatsApp.chatbot.repository;

import com.whatsApp.chatbot.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
