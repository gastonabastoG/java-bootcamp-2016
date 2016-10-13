package com.tom.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class CartImplementation implements CartService{

	List<String> cartItems = new ArrayList<String>();
	
	public void addToCart(String item) {
		cartItems.add(item);
	}

	public void deleteFromCart(int index) {
		// TODO Auto-generated method stub
		
	}

	public List<String> listCart() {
		// TODO Auto-generated method stub
		return cartItems;
	}

	public void finishBuy() {
		// TODO Auto-generated method stub
		
	}

}
