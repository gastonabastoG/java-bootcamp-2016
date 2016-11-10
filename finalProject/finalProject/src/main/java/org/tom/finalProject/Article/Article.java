package org.tom.finalProject.Article;

import org.tom.finalProject.BaseEntity;

public class Article extends BaseEntity {

	private Double price;
	private String name,category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	/*/public Article(String name, Double price, String category){
		this.setPrice(price);
		this.setName(name);
		this.setCategory(category);
	}*/
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
