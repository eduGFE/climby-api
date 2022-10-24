package com.climby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yibao.beta","com.climby"})
@MapperScan({"es.climby.dao.mapper"})
public class BetaWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(BetaWebApplication.class, args);
    }
}
