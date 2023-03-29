package com.restApplication.servers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ServersApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServersApiApplication.class, args);
		System.out.println("Application Started");
	}

}
