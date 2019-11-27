package com.study.cloud.serviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProviderController {
    @GetMapping
    public String sayHello() {
        return "hello";
    }
}
