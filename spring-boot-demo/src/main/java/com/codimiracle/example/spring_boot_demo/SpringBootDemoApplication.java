package com.codimiracle.example.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.codimiracle.example.spring_boot_demo.model.entity")
@ComponentScan("com.codimiracle.example.spring_boot_demo.controller")
@ComponentScan("com.codimiracle.example.spring_boot_demo.service")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
