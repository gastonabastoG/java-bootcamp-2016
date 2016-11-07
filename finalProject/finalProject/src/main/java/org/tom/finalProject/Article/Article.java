package org.tom.finalProject.Article;


public class Article {

	private float price;
	private String name;
	
	public Article(String name, float price){
		this.setPrice(price);
		this.setName(name);
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
