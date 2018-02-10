package com.yking.sp;

import com.yking.sp.config.StringToDateConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.yking.sp")
@MapperScan(basePackages = "com.yking.sp")
public class SpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpApplication.class, args);
	}


	@Bean
	public StringToDateConverter addDateConvert() {
		return new StringToDateConverter();
	}

}
