package com.generalSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.generalSystem.fegin"})
@MapperScan("com.generalSystem.mapper")
public class LoggingApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoggingApplication.class,args);
    }
}
