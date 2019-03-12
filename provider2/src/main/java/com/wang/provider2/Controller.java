package com.wang.provider2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired ServiceImpl service;
    @GetMapping(value = "sayHello")
    @ResponseBody
    public String say(){
        return service.sayHello();
    }
}
