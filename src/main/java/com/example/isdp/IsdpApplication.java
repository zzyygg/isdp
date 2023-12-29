package com.example.isdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class IsdpApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsdpApplication.class, args);
    }

}
