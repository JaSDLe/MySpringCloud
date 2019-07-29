package com.jason.myeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClientApplication.class, args);
    }

}
