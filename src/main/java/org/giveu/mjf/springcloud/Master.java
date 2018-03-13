package org.giveu.mjf.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Master {
	
	private static Logger logger = LoggerFactory.getLogger(Master.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Master.class, args);
		logger.info("springboot run success");
	}

}
