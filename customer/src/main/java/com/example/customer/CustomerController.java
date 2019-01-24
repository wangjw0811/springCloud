package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
    @Autowired
    private ClientServiceImpl clientService;


        @RequestMapping("/test")
        @ResponseBody
        public String index(){
            return clientService.say();
        }

}
