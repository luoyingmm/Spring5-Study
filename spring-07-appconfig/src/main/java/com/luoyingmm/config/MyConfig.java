package com.luoyingmm.config;

import com.luoyingmm.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.luoyingmm.pojo")
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
