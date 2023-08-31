package com.example.foremail;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ForEmailApplication {


    public static void main(String[] args) {
        SpringApplication.run(ForEmailApplication.class, args);
    }
}
