package com.xiang.springcloud.dao;

import com.xiang.springcloud.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 23:40
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
