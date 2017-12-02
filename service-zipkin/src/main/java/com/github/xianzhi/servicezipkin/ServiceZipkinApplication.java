package com.github.xianzhi.servicezipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 *@author xianzhi.wang
 */
@SpringBootApplication
@EnableZipkinServer
public class ServiceZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZipkinApplication.class, args);
	}
}
