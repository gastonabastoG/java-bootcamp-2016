package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Topic6Parte1Application {

	private static final Logger log = LoggerFactory.getLogger(Topic6Parte1Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Topic6Parte1Application.class, args);
	}
	
	@Bean
	
	/**public CommandLineRunner demo(AccountRepository repository) {
		
		return (args) -> {
			// save a couple of accounts
			//repository.save(new Account("alber", "alber"));
			//repository.save(new Account("nico", "molina"));
			//repository.save(new Account("cuca", "cuca20"));
			//repository.save(new Account("mate", "palo"));

			// fetch all customers
			log.info("Accounts found with findAll():");
			log.info("-------------------------------");
			for (Account account : repository.findAll()) {
				log.info(account.toString());
			}
            log.info("");

			// fetch an individual account by ID
			Account account = repository.findOne(2L);
			log.info("Account found with findOne(2L):");
			log.info("--------------------------------");
			log.info(account.toString());
            log.info("");

			// fetch accounts by username
			log.info("Account found with findByUsername('alber'):");
			log.info("--------------------------------------------");
			for (Account tv : repository.findByUsername("alber")) {
				log.info(tv.toString());
			}
            log.info("");
		};
		**/
		
		public CommandLineRunner demo2(ProductRepository repository1) {
			
			return (args) -> {
				
			
				// save a couple of products
				//repository1.save(new Product("PC", "Pentium", 3000.00, "elec"));
				//repository1.save(new Product("Phone", "Red", 200.00, "elec"));
				//repository.save(new Product("cuca", "cuca20"));
				//repository.save(new Product("mate", "palo"));
	
				// fetch all customers
				log.info("Products found with findAll():");
				log.info("-------------------------------");
				for (Product product : repository1.findAll()) {
					log.info(product.toString());
				}
	            log.info("");

				// fetch an individual product by ID
				Product product = repository1.findOne(2L);
				log.info("Product found with findOne(2L):");
				log.info("--------------------------------");
				log.info(product.toString());
	            log.info("");

				// fetch product by Name
				log.info("Product found with findByUsername('alber'):");
				log.info("--------------------------------------------");
				for (Product tv : repository1.findByName("PC")) {
					log.info(tv.toString());
				}
	            log.info("");
			};
		}
	
	}
