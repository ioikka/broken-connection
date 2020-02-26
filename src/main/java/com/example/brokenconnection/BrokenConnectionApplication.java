package com.example.brokenconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BrokenConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrokenConnectionApplication.class, args);
    }

}
