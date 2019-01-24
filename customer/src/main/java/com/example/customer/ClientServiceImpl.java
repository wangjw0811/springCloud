package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ClientServiceImpl {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring-cloud-service}")
    private String url;
    public String say(){
        String result = restTemplate.getForObject(url+"sayhello/", String.class);
        return result;
    }
}
