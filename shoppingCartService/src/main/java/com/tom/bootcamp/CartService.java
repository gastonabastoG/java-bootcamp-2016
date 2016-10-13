package com.tom.bootcamp;

public interface CartService{
	
	//add/remove products from the cart
	public void addToCart();
	
	public void deleteFromCart();
	
	
	// get all the products in the cart
	public void listCart();
	
	// clear products list and hypothetically make the buy
	public void finishBuy();
}
