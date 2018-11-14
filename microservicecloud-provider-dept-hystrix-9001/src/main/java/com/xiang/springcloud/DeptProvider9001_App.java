package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 23:53
 */
@SpringBootApplication
@EnableEurekaClient //服务启动后会将这个服务注册到eureka
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider9001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider9001_App.class,args);
    }
}
