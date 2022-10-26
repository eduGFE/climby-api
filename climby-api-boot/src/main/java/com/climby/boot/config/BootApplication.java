package com.climby.boot.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.climby.controller")
public class BootApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootApplication.class, args);
	}
}

