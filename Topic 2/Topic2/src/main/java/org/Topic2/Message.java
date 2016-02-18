package org.Topic2;

public class Message {
	
	private String message;
	private String author;
	
	Message(String author, String message)
	{
		this.author = author;
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void setMessage( String message)
	{
		this.message = message;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public void setAuthor( String author)
	{
		this.author = author;
	}
	
}
