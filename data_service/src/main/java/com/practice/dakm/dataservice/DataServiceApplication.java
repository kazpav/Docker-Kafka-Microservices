package com.practice.dakm.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataServiceApplication {

    public static void main(String[] args) {
        System.out.println("===============================================> Startup test");
        SpringApplication.run(DataServiceApplication.class, args);
    }
}
