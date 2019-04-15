package com.practice.dakm.dataservice.controller;

import com.practice.dakm.dataservice.dto.UserDto;
import com.practice.dakm.dataservice.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private KafkaProducerService kafkaProducerService;


    @PostMapping(Endpoints.USER_URL)
    public void saveUser(@RequestBody UserDto userDto) {
        kafkaProducerService.sendMessage(userDto);
    }

    @GetMapping("/test")
    public String testPage(){
        System.out.println("tst page");
        return "testing page";
    }
}
