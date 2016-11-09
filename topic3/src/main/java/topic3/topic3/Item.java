package topic3.topic3;

public class Item 
{

	private Double price;
	private String name;
	
	public Item(Integer code, Double price, String name)
	{
		this.price = price;
		this.name = name;
	}

	public Double getPrice() 
	{
		return price;
	}

	public String getName()
	{
		return name;
	}

	public void setPrice(Double price) 
	{
		this.price = price;
	}
	
}