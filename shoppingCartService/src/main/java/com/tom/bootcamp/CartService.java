package com.tom.bootcamp;

public interface CartService{
	
	//add/remove products from the cart
	public void addToCart();
	
	public void deleteFromCart(int index);
	
	
	// get all the products in the cart
	public String[] listCart();
	
	// clear products list and hypothetically make the buy
	public void finishBuy();
}
