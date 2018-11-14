package com.xiang.springcloud.controller;

import com.xiang.springcloud.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/9 00:04
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private RestTemplate restTemplate;

    //private static  final String BASE_URL="http://localhost:8001";
    private static  final String BASE_URL="http://MICROSERVICECLOUD-DEPT";

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return  restTemplate.getForObject(BASE_URL+"/dept/get/"+id,Dept.class);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return  restTemplate.getForObject(BASE_URL+"/dept/list",List.class);
    }

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return  restTemplate.postForObject(BASE_URL+"/dept/add",dept,Boolean.class);
    }
}
