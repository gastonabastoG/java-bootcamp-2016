package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findByName(String name);
	
	List<Product> findByCategory(String category);

}
