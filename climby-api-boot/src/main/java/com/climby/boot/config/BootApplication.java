package com.climby.boot.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.climby.controller","com.climby.service"})
@MapperScan({"com.climby.dao.data.mapper"})
class BootApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootApplication.class, args);
	}
}

