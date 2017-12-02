package com.github.xianzhi.servicefeign.controller;

import com.github.xianzhi.servicefeign.service.SchServiceHello;
import com.github.xianzhi.servicefeign.service.SchServiceHello2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xianzhi.wang
 * @date 2017/11/27 -13:16
 * 在Web层的controller层，对外暴露一个”/hello”的API接口
 */
@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private SchServiceHello schServiceHello;

    @Autowired
    private SchServiceHello2 schServiceHello2;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        LOGGER.info("feign ....   hello");
        return schServiceHello.sayHelloFromClientOne(name);
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String sayHi2(@RequestParam String name) {
        LOGGER.info("feign ....   hello2");
        return schServiceHello2.sayHelloFromClientOne2(name);
    }
}
