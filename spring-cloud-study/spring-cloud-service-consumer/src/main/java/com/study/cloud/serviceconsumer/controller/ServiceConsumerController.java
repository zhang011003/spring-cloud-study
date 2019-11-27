package com.study.cloud.serviceconsumer.controller;

import com.study.cloud.serviceconsumer.feign.ServiceProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceConsumerController {

    @Autowired
    private ServiceProviderFeignClient feignClient;

    @GetMapping("sayHello")
    public String sayHello() {
        return feignClient.sayHello();
    }

}


