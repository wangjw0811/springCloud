package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired ServiceImpl service;
    @GetMapping(value = "sayhello")
    @ResponseBody
    public String sayHello(){
        System.out.println("wang service");
        return service.sayHello();
    }
}
