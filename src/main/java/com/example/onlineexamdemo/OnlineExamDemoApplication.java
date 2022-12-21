package com.example.onlineexamdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@ComponentScan(basePackages = {"com.example.onlineexamdemo.api"})
@SpringBootApplication
public class OnlineExamDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OnlineExamDemoApplication.class, args);
    }

}
