package com.belle.springsecurityoauth2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.belle.springsecurityoauth2.dao")
public class Springsecurityoauth2Application {

    public static void main(String[] args) {
        SpringApplication.run (Springsecurityoauth2Application.class, args);
    }
}
