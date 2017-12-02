package com.github.xianzhi.servicefeign.hystric;

import com.github.xianzhi.servicefeign.service.SchServiceHello2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author xianzhi.wang
 * @date 2017/11/30 -13:09
 */
@Component
public class SchServiceHello2Hystric implements SchServiceHello2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchServiceHello2Hystric.class);

    @Override
    public String sayHelloFromClientOne2(String name) {
        LOGGER.error("fallback .... hello2");
        return "{\"code\":\"1\"}";
    }
}
