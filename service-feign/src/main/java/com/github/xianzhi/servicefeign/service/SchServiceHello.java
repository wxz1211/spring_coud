package com.github.xianzhi.servicefeign.service;

import com.github.xianzhi.servicefeign.hystric.SchServiceHelloHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xianzhi.wang
 * @date 2017/11/27 -13:11
 * <p>
 * Feign中使用断路器
 * FeignClient的SchServiceHello接口的注解中加上fallback的指定类
 */
@FeignClient(value = "service-user", fallback = SchServiceHelloHystric.class)
public interface SchServiceHello {
    /**
     * 通过@ FeignClient（“服务名”），来指定调用哪个服务
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);

}
