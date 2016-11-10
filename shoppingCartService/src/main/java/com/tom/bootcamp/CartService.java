package com.tom.bootcamp;

import java.util.List;


public interface CartService{
	
	/**<h5>Add/remove products from the cart</h5>
	 addToCart and deleteFromCart methods are the ones used to administrate the items on the list
	
	 * @param item This string should be the name of the item
	 * that the client wants to add to the cart, the order in the cart wil be the default
	 * order given by the java.util.List class */
	
	public void addToCart(String item);
	
	/**@param index This argument should be the index of the element the client wants to delete from the cart */
	public void deleteFromCart(int index);
	
	/** <h5>get all the elements from the cart</h5>
	 * 
	 * this method takes no parameters and returns an ArrayList containing the items from the cart 
	 * ordered by order of addition
	 */
	public List<String> listCart();
	
	
	/**<h5>Clear cart</h5>
	 * 
	 * This method calls .clear() on the cart items ArayList, we assume that this action 
	 * is followed by the server logic to effectively realize the buy
	 * */
	
	public void finishBuy();
}
