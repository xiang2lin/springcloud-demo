package com.xiang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/13 19:01
 * 连3344服务 从github上的配置文件中读取数据
 */
@RestController
public class ConfigClientController {

    //从github上的配置文件中读取数据
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defauletZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }
}
