package com.ag.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class RentApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RentApplication.class, args);
	}
}
