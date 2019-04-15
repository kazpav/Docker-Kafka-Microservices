package com.practice.dakm.dataservice.service.impl;

import com.practice.dakm.dataservice.dto.UserDto;
import com.practice.dakm.dataservice.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private static final String TOPIC = "Kafka_Example_json";

    @Autowired
    private KafkaTemplate<String, UserDto> kafkaTemplate;

    @Override
    public void sendMessage(UserDto userDto) {
        kafkaTemplate.send(TOPIC, userDto);
    }
}
