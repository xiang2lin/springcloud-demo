package com.xiang.springcloud.service;

import com.xiang.springcloud.dao.DeptDao;
import com.xiang.springcloud.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 23:46
 */
@Service
public class DeptServiceImpl implements  DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
