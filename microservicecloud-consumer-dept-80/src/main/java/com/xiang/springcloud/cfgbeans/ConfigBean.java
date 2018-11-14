package com.xiang.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: xiang2lin
 * @Date: 2018/11/9 00:02
 */
@Configuration
public class ConfigBean {

    // Rest API, 用来发起rest请求
    @Bean
    @LoadBalanced //rest调用时带负载均衡,  默认轮询
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

   // @Bean
    //和 RibbonClient 的configuration 不能同时用
    public IRule getLoadBanalceRule(){
        return  new RoundRobinRule(); //随机负载
        //RetryRule 重试 500毫秒
        //RoundRobinRule  默认的轮询负载
        //RandomRule() //随机负载
    }
}
