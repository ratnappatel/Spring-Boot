package com.gl.rest.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	//private static final Logger  LOGGER=LoggerFactory.getLogger(ProductApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
		/*
		 * LOGGER.info("A Logger message using SLF4J + with LOG Level : INFO ");
		 * LOGGER.error("A Logger message using SLF4J + with LOG Level : ERROR ");
		 * LOGGER.debug("A Logger message using SLF4J + with LOG Level : DEBUG ");
		 * LOGGER.trace("A Logger message using SLF4J + with LOG Level : TRACE");
		 */
		
	}

}
