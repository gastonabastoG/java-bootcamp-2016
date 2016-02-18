package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Topic6Application {
	
	private static final Logger log = LoggerFactory.getLogger(Topic6Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Topic6Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		
		return (args) -> {
			// save a couple of customers
			repository.save(new Product("TV", "20 pounds", 200.89));
			repository.save(new Product("PC", "Intel", 4000.00));
			repository.save(new Product("Tasa", "Roja", 30.00));
			repository.save(new Product("Silla", "3 patas", 100.00));

			// fetch all customers
			log.info("Products found with findAll():");
			log.info("-------------------------------");
			for (Product product : repository.findAll()) {
				log.info(product.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Product product = repository.findOne(1L);
			log.info("Product found with findOne(1L):");
			log.info("--------------------------------");
			log.info(product.toString());
            log.info("");

			// fetch customers by last name
			log.info("Product found with findByName('TV'):");
			log.info("--------------------------------------------");
			for (Product tv : repository.findByName("TV")) {
				log.info(tv.toString());
			}
            log.info("");
		};
	}
}
