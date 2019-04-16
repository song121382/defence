package com.defence.doom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoomApplication.class, args);
    }

}
