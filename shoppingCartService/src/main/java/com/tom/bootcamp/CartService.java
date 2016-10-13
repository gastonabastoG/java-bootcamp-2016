package com.tom.bootcamp;

import java.util.List;


public interface CartService{
	
	//add/remove products from the cart
	/* addToCart and deleteFromCart methods are the ones used to administrate the items on the list*/
	
	/* addToCart takes as argument a String, this string should be the name of the item
	 * that the client wants to add to the cart, the order in the cart wil be the default
	 * order given by the java.util.List class */
	
	public void addToCart(String item);
	
	
	public void deleteFromCart(int index);
	
	
	// get all the products in the cart
	public List<String> listCart();
	
	// clear products list and hypothetically make the buy
	public void finishBuy();
}
