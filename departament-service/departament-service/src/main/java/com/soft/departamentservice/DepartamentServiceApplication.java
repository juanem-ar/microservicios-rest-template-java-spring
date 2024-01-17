package com.soft.departamentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DepartamentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartamentServiceApplication.class, args);
	}

}
