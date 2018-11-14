package com.xiang.springcloud.service;

import com.xiang.springcloud.domain.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/12 21:42
 * 服务降级统一处理
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setId(id)
                        .setName("服务降级测试....")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                Dept dept1=    new Dept().setId(-1l)
                        .setName("服务降级测试....")
                        .setDb_source("no this database in MySQL");
                Dept dept2=  new Dept().setId(-1l)
                        .setName("服务降级测试....")
                        .setDb_source("no this database in MySQL");
                List<Dept> list=new ArrayList<Dept>();
                list.add(dept1);
                list.add(dept2);
                return list;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
