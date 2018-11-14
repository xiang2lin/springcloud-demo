package com.xiang.springcloud.controller;

import com.xiang.springcloud.domain.Dept;
import com.xiang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/11 13:08
 * feign继承了ribbon   自带ribbon提供的轮询负载
 */
@RestController
public class DeptController_Feign {


    @Autowired
    private DeptClientService deptClientService;

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }

    @PostMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.deptClientService.add(dept);
    }
}
