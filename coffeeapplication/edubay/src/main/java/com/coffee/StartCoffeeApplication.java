package com.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.coffee.controller","com.coffee.dao"})
public class StartCoffeeApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartCoffeeApplication.class, args);
    }

}