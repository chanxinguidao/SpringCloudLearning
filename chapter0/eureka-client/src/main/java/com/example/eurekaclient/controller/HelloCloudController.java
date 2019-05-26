package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCloudController {

    /**
     * 加个读取配置端口的参数，用于查看是否实现负载均衡
     */
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name){
        return "hi "+ name + " , welcome to learning SpringCloud ! I am from port "+ port;
    }
}
