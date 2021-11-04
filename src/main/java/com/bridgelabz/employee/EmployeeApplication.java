package com.bridgelabz.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(EmployeeApplication.class, args);
		log.info("Employee payroll app started in {} Environment",
				 context.getEnvironment().getProperty("environment"));
		log.info("Employee payroll DB User is {}",
				  context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
