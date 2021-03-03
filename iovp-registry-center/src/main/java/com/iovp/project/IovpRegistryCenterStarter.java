package com.iovp.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧公务车信息平台-注册中心启动类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class IovpRegistryCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(IovpRegistryCenterStarter.class, args);
	}
}
