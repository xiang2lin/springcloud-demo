package com.xiang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/10 17:30
 * 自定义负载规则
 */
@Configuration
public class MyRule {
    @Bean
    public IRule mySelfRule(){
        return  new RandomRule_X();
    }
}
