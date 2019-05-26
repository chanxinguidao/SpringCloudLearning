package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = FeigenServiceHystric.class)
public interface FeigenService {

    @GetMapping("/hello")
    String helloWorld(@RequestParam String name);
}
