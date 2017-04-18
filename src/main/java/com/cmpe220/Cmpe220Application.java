package com.cmpe220;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Cmpe220Application {

	public static void main(String[] args) {
		SpringApplication.run(Cmpe220Application.class, args);
	}
}
