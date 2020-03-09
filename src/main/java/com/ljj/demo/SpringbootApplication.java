package com.ljj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication注解相当于同时使用@EnableAutoConfiguration、@ComponentScan、@Configurations三个注解
//@EnableAutoConfiguration用于打开SpringBoot自动配置，而其余注解为Spring注解，这里不再赘述
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}