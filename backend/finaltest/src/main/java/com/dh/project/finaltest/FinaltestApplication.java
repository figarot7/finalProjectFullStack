package com.dh.project.finaltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinaltestApplication {

	@RequestMapping("/")
	String home(){
		return "Welcome to final project";
	}

	public static void main(String[] args) {
		SpringApplication.run(FinaltestApplication.class, args);
	}
}
