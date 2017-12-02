package com.github.xianzhi.servicefeign.service;

import com.github.xianzhi.servicefeign.hystric.SchServiceHello2Hystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xianzhi.wang
 * @date 2017/11/30 -13:08
 */

@FeignClient(value = "service-hello2", fallback = SchServiceHello2Hystric.class)
public interface SchServiceHello2 {

    /**
     * 通过@ FeignClient（“服务名”），来指定调用哪个服务
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    String sayHelloFromClientOne2(@RequestParam(value = "name") String name);
}
