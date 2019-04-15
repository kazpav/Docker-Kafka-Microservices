package com.practice.dakm.daoservice.service;

import com.practice.dakm.daoservice.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl {

    @KafkaListener(topics = "Kafka_Example", id = "group_id")
    public void consume(String message) {
        System.out.println("Consumed " + message);
    }

    @KafkaListener(topics = "Kafka_Example_json", id = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println(user);
    }
}
