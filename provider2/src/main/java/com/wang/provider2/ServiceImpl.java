package com.wang.provider2;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {

    public String sayHello(){
        return "hello cloud from 8003";
    }

}
