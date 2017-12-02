package com.github.xianzhi.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xianzhi.wang
 *
 * Feign是一个声明式的伪Http客户端，
 * 它使得写Http客户端变得更简单。
 * 使用Feign，只需要创建一个接口并注解。
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
 * Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果
 * 加上@EnableFeignClients注解开启Feign的功能
 * <p>
 * 简而言之：
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon
 * <p>
 * EnableHystrixDashboard  监控台功能
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
