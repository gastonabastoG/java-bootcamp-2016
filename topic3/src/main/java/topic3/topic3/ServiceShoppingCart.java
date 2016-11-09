package topic3.topic3;

import java.util.List;

public class ServiceShoppingCart implements Service
{
	private ShoppingCart sc;
	
	public ServiceShoppingCart()
	{
		sc = new ShoppingCart();
	}
	
	public void addItem(Item item) 
	{
		sc.addItem(item);
	}

	public void removeItem(Item item)
	{
		sc.removeItem(item);
	}

	public List<Item> getItems()
	{
		return sc.getItems();
	}
}