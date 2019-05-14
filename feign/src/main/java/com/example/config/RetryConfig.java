package com.example.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-05-14 13:35:07
 **/
@Configuration
public class RetryConfig {
    @Bean
    public Retryer retryHandler(){
        return Retryer.NEVER_RETRY;
    }
}
