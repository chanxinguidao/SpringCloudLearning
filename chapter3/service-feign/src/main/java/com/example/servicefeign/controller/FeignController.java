package com.example.servicefeign.controller;
import com.example.servicefeign.service.FeigenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class FeignController {

    @Autowired
    FeigenService feigenService;

    @GetMapping("/helloFeign")
    public String hello(@RequestParam String name){
        return feigenService.helloWorld(name);
    }
}
