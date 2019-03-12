package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {
    @Autowired
    IFeignClient feignClient;
    @GetMapping(value = "/sayHello")
    @ResponseBody
    public String test() {
        return feignClient.sayHello();
    }
}
