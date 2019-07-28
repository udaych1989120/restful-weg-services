package com.uday.rest.webservices.restfulwegservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"helloworld","user"})
@SpringBootApplication
public class RestfulWegServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWegServicesApplication.class, args);
	}
}
