package com.example.customer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
    @Autowired
    private ClientServiceImpl clientService;


        @RequestMapping("/sayHello")
        @ResponseBody
        @HystrixCommand(fallbackMethod = "errorFallback")
        public String index(){
            return clientService.sayHello();
        }

        public String errorFallback() {
            return "请求失败！";
        }


}
