package com.twigcodes.discovery;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务发现服务器
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaServer
@EnableConfigServer
@RefreshScope
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
