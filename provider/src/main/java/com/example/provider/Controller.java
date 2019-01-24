package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired ServiceImpl service;
    @GetMapping(value = "sayhello")
    @ResponseBody
    public String say(){
        System.out.println("wang service");
        return service.sayHello();
    }
}
