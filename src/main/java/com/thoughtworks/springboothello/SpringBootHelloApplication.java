package com.thoughtworks.springboothello;

import com.thoughtworks.springboothello.domain.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootHelloApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootHelloApplication.class, args);
        System.out.println(Arrays.toString(run.getBeanNamesForType(User.class)));
        System.out.println(run.getBeanDefinitionCount());
    }

}
