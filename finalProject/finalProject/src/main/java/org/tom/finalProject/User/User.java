package org.tom.finalProject.User;

import org.mongodb.morphia.annotations.Entity;
import org.tom.finalProject.BaseEntity;
import org.tom.finalProject.Article.Article;
import org.tom.finalProject.Cart.Cart;

@Entity
public class User extends BaseEntity implements UserAPI{
	
	private Cart userCart;
	private float credits;
	private String username, password;
	
	
	public User(String username, String password){
		this.setPassword(password);
		this.setUsername(username);
		this.credits = 0;
	}

	public User(String username, String password, float creds){
		this.setPassword(password);
		this.setUsername(username);
		this.credits = creds;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addItem(Article item){
		userCart.addToCart(item);
	}
	
	public void removeItem(Article item){
		userCart.deleteFromCart(item);
	}
	
	public void buyCart(){
		credits =- userCart.getTotalPrice();
	}
	
	public void chargeCreds(float cred){
		credits =+ cred;
	}

}
