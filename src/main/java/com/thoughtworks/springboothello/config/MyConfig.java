package com.thoughtworks.springboothello.config;

import com.thoughtworks.springboothello.domain.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User user(){
        return new User("张三",10);
    }
}
