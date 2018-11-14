package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/13 17:36
 */
@SpringBootApplication
@EnableConfigServer //配置中心
public class Config3344_APP {
    public static void main(String[] args) {
        SpringApplication.run(Config3344_APP.class,args);
    }
}
