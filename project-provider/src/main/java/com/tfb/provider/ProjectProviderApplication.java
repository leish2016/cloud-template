package com.tfb.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.TimeZone;


@SpringBootApplication
@MapperScan(basePackages = "com.tfb.provider.mapper")
@EnableDiscoveryClient
public class ProjectProviderApplication {

    public static void main(String[] args) {
        //设置默认时区
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ProjectProviderApplication.class, args);
        String dbUrl = applicationContext.getEnvironment().getProperty("dbUrl");
        System.err.println("dbUrl:"+dbUrl);
    }

}
