package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/14 14:27
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerGit_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerGit_APP.class,args);
    }
}
