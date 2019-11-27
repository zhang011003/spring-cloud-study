package com.study.cloud.serviceconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-provider")
public interface ServiceProviderFeignClient {
    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    String sayHello();
}
