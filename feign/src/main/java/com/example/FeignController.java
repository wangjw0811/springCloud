package com.example;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {
    @Autowired
    IFeignClient feignClient;
    @GetMapping(value = "/getSayHello")
    @ResponseBody
    @HystrixCommand(commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    },commandKey="getSayHello")
    public String getSayHello() {
        return feignClient.sayHello();
    }

    @PostMapping(value = "/postSayHello")
    @ResponseBody
    @HystrixCommand(commandProperties={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    },commandKey="postSayHello")
    public String postSayHello() {
        return feignClient.sayHello();
    }


}
