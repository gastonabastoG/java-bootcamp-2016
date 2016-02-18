package org.Topic2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
	public static TreeMap < Integer, Message > blog = Blog.getInstance();
	
    public static void main( String[] args )
    {
    	
    	Message message1 = new Message("alber", "algo pusieron primero");
    	
    	blog.put(1, message1);
    	
    	Message message2 = new Message("fabricio", "algo pusieron despues");
    	
    	blog.put(2, message2);
    	
    	Message message3 = new Message("alber", "algo pusieron despues de eso");
    	
    	blog.put(3, message3);
    	
        System.out.println( "Hello World!" );
        
        MessageHandler.getAuthorMessage("fabricio");
        
        MessageHandler.LastTenMessages();
        
        blog.remove(3);
        
    }
    
}
