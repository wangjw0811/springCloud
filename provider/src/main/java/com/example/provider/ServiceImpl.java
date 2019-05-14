package com.example.provider;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {


    public String sayHello(){
        System.out.println("8002");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello cloud from 8002";
    }

}
