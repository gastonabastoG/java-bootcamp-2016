package org.tom.finalProject.Cart;

import org.tom.finalProject.Article.*;

public interface CartAPI {

	public void addToCart(Article article);
	
	public void deleteFromCart(Article article);
	
}
