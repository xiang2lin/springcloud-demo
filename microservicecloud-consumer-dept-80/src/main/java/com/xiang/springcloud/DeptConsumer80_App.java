package com.xiang.springcloud;


import com.xiang.myrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/9 00:12
 */
@SpringBootApplication
@EnableEurekaClient
//name代表的是自定义负载均衡的是哪个提供者，configuration 代表使用的是哪个自定义的负载均衡类
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
