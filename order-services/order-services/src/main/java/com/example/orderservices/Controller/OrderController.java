package com.example.orderservices.Controller;

import com.example.orderservices.servies.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/create/order")
    public Map<String, Integer> creatOrder(@RequestParam("name") String name,@RequestParam("price") Integer price) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put(name, price);

        return producerService.sendMessage(stringIntegerMap);

    }
}
