package com.xiang.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    /**
     * get()方法抛异常后会调用 fallbackMethod ， 返回兜底数据
     * @param id
     * @return
     */
    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept=deptService.get(id);
        if (null==dept){
            throw  new RuntimeException("not found");
        }
        return dept;
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    //get()方法抛异常后，会自动调用这个方法
    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setId(id)
                .setName("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }
}
