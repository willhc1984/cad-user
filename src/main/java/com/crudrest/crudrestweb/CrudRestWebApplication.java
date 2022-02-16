package com.crudrest.crudrestweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "com.crudrest.crudrestweb.model")
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class CrudRestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudRestWebApplication.class, args);
	}

}
