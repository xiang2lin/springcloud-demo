package com.xiang.springcloud.service;

import com.xiang.springcloud.domain.Dept;

import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 23:45
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
