package com.croper.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.croper.web")
@EnableMongoRepositories({"com.croper.repo"}) 
public class CroperWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CroperWebAppApplication.class, args);
	}
}