package org.Topic2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Blog {

	private static TreeMap < Integer, Message > blog = new TreeMap<Integer, Message>();
	
	protected MessageHandler messageHandler;
	
	public MessageHandler getMessageHandler(){
		return messageHandler;
	}
	
	public void setMessageHandler( MessageHandler messageHandler )
	{
		this.messageHandler = messageHandler;
	}
	
	
	Blog() {
	}

	public static TreeMap < Integer, Message > getInstance() {
		if (blog == null) {
			blog = Blog.blog;
		}
		return blog;
	}

	public int saveMessage(){
		
		Message message1 = new Message("alber", "algo pusieron primero");
    	
    	blog.put(1, message1);
    	
    	Message message2 = new Message("fabricio", "algo pusieron despues");
    	
    	blog.put(2, message2);
    	
    	Message message3 = new Message("alber", "algo pusieron despues de eso");
    	
    	blog.put(3, message3);
    	
    	return blog.size();
	}
	
}
