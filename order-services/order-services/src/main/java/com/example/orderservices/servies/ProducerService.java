package com.example.orderservices.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String ,String>template;
    @Value("${kafka.topic}")
    private String topic;

    public Map<String,Integer> sendMessage(Map<String,Integer> order){
        template.send(topic,order.toString());
        return order;
    }
}
