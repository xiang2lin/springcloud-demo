package com.xiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/13 15:21
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527_APP.class,args);
    }
}
