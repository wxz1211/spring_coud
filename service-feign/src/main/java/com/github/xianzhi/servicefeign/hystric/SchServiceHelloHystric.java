package com.github.xianzhi.servicefeign.hystric;

import com.github.xianzhi.servicefeign.service.SchServiceHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author xianzhi.wang
 * @date 2017/11/27 -13:57
 */
@Component
public class SchServiceHelloHystric implements SchServiceHello {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchServiceHelloHystric.class);

    @Override
    public String sayHelloFromClientOne(String name) {
        LOGGER.error("fallback .... hello2");
        return "{\"code\":\"1\"}";
    }

}
