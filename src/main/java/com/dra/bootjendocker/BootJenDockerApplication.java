package com.dra.bootjendocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BootJenDockerApplication {

	private static final Logger log=Logger.getLogger(BootJenDockerApplication.class.getName());

	public static void main(String[] args) {

		SpringApplication.run(BootJenDockerApplication.class, args);
		log.info("My interaction to main() to console log");
		log.info("Second test for my program");
	}

}
