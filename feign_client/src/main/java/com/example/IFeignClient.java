package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "ticket-provider",fallback= FeignClientFallback.class)
public interface IFeignClient {
    @RequestMapping(value = "sayHello",method =RequestMethod.GET)
    String sayHello();
}
