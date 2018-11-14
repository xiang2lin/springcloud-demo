package com.xiang.springcloud.controller;

import com.xiang.springcloud.domain.Dept;
import com.xiang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 23:48
 */
@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return  deptService.list();
    }

    @PostMapping(value = "/dept/add")
    public  boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }
}
