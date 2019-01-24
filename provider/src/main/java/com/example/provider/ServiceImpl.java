package com.example.provider;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {

    public String sayHello(){
        return "hello11";
    }

}
