package com.croper.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CroperApplication {

	public static void main(String[] args) {
		 System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(CroperApplication.class, args);
	}
}
