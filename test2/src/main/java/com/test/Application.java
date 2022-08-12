package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Application  {

    public static void main(String[] args) {
        System.out.println(111);
        System.out.println(111);
        SpringApplication.run(Application.class, args);
    }
}
