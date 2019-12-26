package com.music.server;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@MapperScan(basePackages = "com.music.server.mapper")
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ServerApplication.class, args);

        final Logger log = LoggerFactory.getLogger(ServerApplication.class);
        log.info("该服务的名称是：{}",context.getEnvironment().getProperty("spring.application.name"));
        log.info("该服务的启动端口是：{}",context.getEnvironment().getProperty("server.port"));
    }

}
