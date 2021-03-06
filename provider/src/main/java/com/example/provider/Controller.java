package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired ServiceImpl service;
    @GetMapping(value = "sayHello")
    @ResponseBody
    public String say(){
        return service.sayHello();
    }
}
