package com.pulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pulse.service.RabbitMQProducer;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private RabbitMQProducer producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return "Message sent to RabbitMQ: " + message;
    }
}
