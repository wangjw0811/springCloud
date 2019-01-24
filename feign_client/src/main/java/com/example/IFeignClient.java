package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient("ticket-provider")
public interface IFeignClient {
    @RequestMapping(value = "sayhello",method =RequestMethod.GET)
    @ResponseBody
    String sayHello();
}
