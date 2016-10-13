package com.tom.bootcamp;

import java.util.List;

public interface CartService{
	
	//add/remove products from the cart
	public void addToCart(String item);
	
	public void deleteFromCart(int index);
	
	
	// get all the products in the cart
	public List<String> listCart();
	
	// clear products list and hypothetically make the buy
	public void finishBuy();
}
