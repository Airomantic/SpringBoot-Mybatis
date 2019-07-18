package com.example.Register;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.controller"})
//启动类启动扫描
//@ComponentScan(basePackages = {"com.example.controller","com.example.service"})
@ComponentScan(basePackages = {"com.example"})
@MapperScan(basePackages = {"com.example.dao"})
public class RegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
