# WhatsApp Chatbot Simulation (Spring Boot + MySQL)

# Overview

This project is a WhatsApp Chatbot Simulation Backend built using Spring Boot.It simulates how a chatbot receives messages and sends replies, while storing all conversations in a MySQL database.

# Features

- REST API endpoint /webhook

- Accepts JSON input simulating WhatsApp messages

- Returns predefined responses (hi → Hello, bye → Goodbye)

- Stores messages and replies in MySQL database

- Follows 3-layer architecture:

- Controller Layer

- Service Layer

- Repository Layer

- Logs all messages in console


# Tech Stack

- Java

- Spring Boot

- Spring Data JPA

- MySQL

- Maven

# API Endpoint

POST /webhook

Request

{
  "from": "nikhil",
  "message": "hi"
}

Response

{
  "reply": "Hello"
}

# Testing

- Method: POST

- URL: http://localhost:8080/webhook

- Use Postman or any API testing tool

# Run Locally

- Clone the repository

- Setup MySQL database

- Update credentials

- Run project

- mvn spring-boot🇧🇳

# Conclusion

This project demonstrates:

- Spring Boot REST API development

- Layered architecture

- MySQL database integration using JPA

- Basic chatbot functionality

# Author

Nikhil
