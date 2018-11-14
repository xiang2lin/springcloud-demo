package com.xiang.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/8 18:19
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long id;
    private String name;
    private String db_source;


    public static void main(String[] args) {
        Dept dept=new Dept();
        dept.setId(1l).setName("开发部").setDb_source("clouddb01");

    }
}
