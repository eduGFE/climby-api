package es.climby.boot.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan({"es.climby.dao.data","es.climby.service.mapstruct"})
public class BootApplication{

	public static void main(String[] args) {

		SpringApplication.run(BootApplication.class, args);
	}

}

