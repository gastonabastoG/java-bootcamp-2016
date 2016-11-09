package topic3.topic3;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart
{
	private List<Item> items;
	private Integer capacity;
	
	public ShoppingCart()
	{
		items = new ArrayList<Item>();
		capacity = 10;
	}
	
	public void addItem(Item i)
	{	
		if (capacity != 0)
		{
			items.add(i);
			capacity--;
		}
		else 
			System.out.println("Can't load, full.");
	}
	
	public void removeItem(Item i)
	{	
		items.remove(i);
		capacity++;
	}
	
	

	public List<Item> getItems()
	{	
		return items;
	}
	
	
}
