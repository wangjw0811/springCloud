package com.example;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallback implements IFeignClient {
    @Override
    public String sayHello() {
        return "访问异常";
    }
}
