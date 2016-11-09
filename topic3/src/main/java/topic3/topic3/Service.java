package topic3.topic3;

import java.util.List;

public interface Service
{

	public void addItem(Item item);
	public void removeItem(Item item);
	public List<Item> getItems();

}