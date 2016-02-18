package org.Topic2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MessageHandler {
	
	public static TreeMap < Integer, Message > blog = Blog.getInstance();

	public void put(int i, Message message) {
		// TODO Auto-generated method stub
		blog.put(i, message);
		
	}
	
	public Message getMessage(int i)
	{
		return blog.get(i);
	}
	
	public static ArrayList<String> getAuthorMessage( String author )
	{
		Message message = new Message("", "");
	
		ArrayList<String> authorMessage = new ArrayList<String>();
	
		// Get a set of the entries
		Set set = Blog.getInstance().entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while(i.hasNext()) {
    	  
			Map.Entry me = (Map.Entry)i.next();
         
			message = blog.get(me.getKey());
			
			if ( message.getAuthor() == author )
			{
				System.out.println(me.getKey() + ": " + message.getMessage());
			}
		}
	
	return authorMessage;
	}
	
	public static ArrayList<String> LastTenMessages()
	{
		int x = 0;
		
		Message message = new Message("", "");
	
		ArrayList<String> lastTenMessages = new ArrayList<String>();
	
		// Get a set of the entries
		Set set = Blog.getInstance().entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		do{
			
			Map.Entry me = (Map.Entry)i.next();
         
			message = blog.get(me.getKey());
			
			System.out.println(me.getKey() + ": " + message.getMessage());
			
			x = x + 1;
			
		}while(i.hasNext() && x <= 10);
	
	return lastTenMessages;
	}
	
}
