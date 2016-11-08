package org.tom.finalProject.Cart;

import java.util.List;

import org.mongodb.morphia.annotations.Embedded;
import org.tom.finalProject.Article.Article;

@Embedded
public class Cart implements CartAPI{

	public List<Article> cartArticles;
	public float totalPrice;

	public void addToCart(Article article){
		totalPrice =+ article.getPrice();
		cartArticles.add(article);
	}

	public void deleteFromCart(Article article){
		totalPrice =- article.getPrice();
		cartArticles.remove(article);
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	};
	
	
}
