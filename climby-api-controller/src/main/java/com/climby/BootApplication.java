package com.climby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.climby")
@MapperScan({"com.climby.dao.data.mapper"})

public class BootApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootApplication.class, args);
    }
}
