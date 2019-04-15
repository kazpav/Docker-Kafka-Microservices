package com.practice.dakm.dataservice.service;

import com.practice.dakm.dataservice.dto.UserDto;

public interface KafkaProducerService {
    public void sendMessage(UserDto userDto);
}
