package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/11 13:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.xiang.springcloud"})
public class DeptConsumer81_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer81_Feign_App.class,args);
    }
}
