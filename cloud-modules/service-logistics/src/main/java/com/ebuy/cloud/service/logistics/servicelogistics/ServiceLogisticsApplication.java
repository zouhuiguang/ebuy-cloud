package com.ebuy.cloud.service.logistics.servicelogistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceLogisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLogisticsApplication.class, args);
    }
}
