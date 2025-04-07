package com.example.demo;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

//	private static final Logger logger = LogManager.getLogger(DemoApplication.class);

	public static void main(String[] args) {
//		logger.info("Hello World!");
//		logger.debug("Hello World!!!");
		SpringApplication.run(DemoApplication.class, args);
	}

}
