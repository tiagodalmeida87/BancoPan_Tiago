package com.demopanacademy.panacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication

@ComponentScan(basePackages = {"Model", "controllers"})

@RequestMapping(path = "/saudacao")
public class PanacademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanacademyApplication.class, args);
	}

	
	@GetMapping("/ola")

	public String ola() {
		return "Hello World!!";
	}
}
