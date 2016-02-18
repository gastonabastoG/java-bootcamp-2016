package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;


private String name;
private String description;
private Double price;
private String category;

public Product( String name, String description, Double price, String category){
	this.name = name;
	this.description = description;
	this.price = price;
	this.category = category;
	
}

public Product(){
	
}

public String getDescription() {
return description;
}

public Long getId() {
return id;
}

public String getName() {
return name;
}

public Double getPrice() {
return price;
}

public String getCategory() {
return category;
}

public void setDescription(String description) {
this.description = description;
}

public void setId(Long id) {
this.id = id;
}

public void setName(String name) {
this.name = name;
}

public void setPrice(Double price) {
this.price = price;
}

public void setCategory(String category) {
this.category = category;
}

}