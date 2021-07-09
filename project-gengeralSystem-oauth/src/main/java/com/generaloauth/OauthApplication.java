package com.generaloauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * •
 * • @author liusongsong
 * • @date2021年07月08日 11:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.generalSystem.mapper.*")
@EnableFeignClients
@EnableCircuitBreaker
public class OauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class,args);
    }
}
