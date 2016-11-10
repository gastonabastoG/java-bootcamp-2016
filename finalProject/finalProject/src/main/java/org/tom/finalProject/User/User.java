package org.tom.finalProject.User;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.tom.finalProject.BaseEntity;
import org.tom.finalProject.Article.Article;
import org.tom.finalProject.Cart.Cart;

@Entity
public class User extends BaseEntity implements UserAPI{
	
	@Embedded
	private Cart userCart;

	private String username, password;

	private Double credits;
	
	public Cart getUserCart() {
		return userCart;
	}

	public void setUserCart(Cart userCart) {
		this.userCart = userCart;
	}

	public Double getCredits() {
		return credits;
	}

	public void setCredits(Double credits) {
		this.credits = credits;
	}
	
	public User(){
		this.credits = 0.00;
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

	public void setPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		//MessageDigest crypto = MessageDigest.getInstance("SHA-256");
		//crypto.update(password.getBytes("UTF-8"));
		this.password = password;//crypto.digest().toString();
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
	
	public void chargeCreds(Double cred){
		credits =+ cred;
	}

}
