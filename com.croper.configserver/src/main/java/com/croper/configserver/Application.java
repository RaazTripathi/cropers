package com.croper.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		 System.setProperty("spring.config.name", "registration-client");

		SpringApplication.run(Application.class, args);
	}
}
