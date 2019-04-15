package com.practice.dakm.daoservice.service;

import com.practice.dakm.daoservice.dao.UserRepository;
import com.practice.dakm.daoservice.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl {
    private static final Logger logger = LogManager.getLogger(KafkaConsumerServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @KafkaListener(topics = "Kafka_Example", id = "group_id")
    public void consume(String message) {
        System.out.println("Consumed " + message);
    }

    @KafkaListener(topics = "Kafka_Example_json", id = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        logger.info("Recieved user: {}", user);
        userRepository.save(user);
    }
}
