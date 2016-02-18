package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
@Id
@GeneratedValue
private Long id;


private String name;
private String description;
private Double price;

public Product( String name, String description, Double price){
	this.name = name;
	this.description = description;
	this.price = price;
	
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
}