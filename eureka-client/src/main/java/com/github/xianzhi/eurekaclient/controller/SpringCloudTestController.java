package com.github.xianzhi.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xianzhi.wang
 * @date 2017/11/27 -11:22
 */
@RestController
public class SpringCloudTestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudTestController.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        LOGGER.info("client  hello");
        return "{\"code\":\"0\"}";
    }

}
