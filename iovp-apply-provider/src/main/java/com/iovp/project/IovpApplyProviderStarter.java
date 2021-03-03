package com.iovp.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>智慧公务车信息平台-申请功能 Provider 启动类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@MapperScan("com.iovp.project.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class IovpApplyProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(IovpApplyProviderStarter.class, args);
	}
}
