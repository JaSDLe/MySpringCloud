package com.jason.myzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class MyZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyZuulApplication.class, args);
    }

}
