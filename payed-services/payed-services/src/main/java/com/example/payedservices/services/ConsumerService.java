package com.example.payedservices.services;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsumerService {
    @KafkaListener(topics = "${kafka.topic}")
    public void   consume(Message<String > order){
        System.out.println("Payed Success with order price "+ order.getPayload());
    }
}
