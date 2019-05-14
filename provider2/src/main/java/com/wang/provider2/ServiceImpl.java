package com.wang.provider2;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {

    public String sayHello(){
        System.out.println("8003");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello cloud from 8003";
    }

}
