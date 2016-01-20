package alber.Topic;

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
    	
    	Message message1 = new Message();
    	
    	message1.setAuthor("alber");
    	
    	message1.setMessage("algo pusieron primero");
    	
    	blog.put(1, message1);
    	
    	Message message2 = new Message();
    	
    	message2.setAuthor("fabricio");
    	
    	message2.setMessage("algo pusieron despues");
    	
    	blog.put(2, message2);
    	
    	Message message3 = new Message();
    	
    	message3.setAuthor("alber");
    	
    	message3.setMessage("algo pusieron despues de eso");
    	
    	blog.put(3, message3);
    	
        System.out.println( "Hello World!" );
        
        Blog.getAuthorMessage("fabricio");
        
        Blog.LastTenMessages();
        
        blog.remove(3);
        
    }
    
}
