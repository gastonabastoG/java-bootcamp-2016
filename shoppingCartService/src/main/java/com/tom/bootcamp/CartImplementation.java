package com.tom.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class CartImplementation implements CartService{

	List<String> cartItems = new ArrayList<String>();
	
	public void addToCart(String item) {
		cartItems.add(item);
	}

	public void deleteFromCart(int index) {
		cartItems.remove(index);
	}

	public List<String> listCart() {
		return cartItems;
	}

	public void finishBuy() {
		// this method should have the business logic such as currencies movement
		System.out.println("Buy accomplished");
		cartItems.clear();
	}

}
