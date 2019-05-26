package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeigenServiceHystric implements  FeigenService {

    @Override
    public String helloWorld(String name) {
        return "oh no,the connection 不能连接 "+ name;
    }
}
