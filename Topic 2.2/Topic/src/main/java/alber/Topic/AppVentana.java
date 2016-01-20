package alber.Topic;

import java.awt.Container;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppVentana extends JApplet {

	public static TreeMap < Integer, Message > blog = Blog.getInstance();
	
	JTextArea messageArea;
	
	JLabel lblAuthor, lblMessage, lblMessageArea;
	JTextField txtAuthor, txtMessage;
	JButton btnSearchAuthor, btnPutMessage, btnLastTen, btnDeleteMessage;
	
	
	
	public void init(){
		
		
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
    	
    	
    	
    	
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		
		lblAuthor = new JLabel("Author:");
		container.add(lblAuthor);
		
		txtAuthor = new JTextField(20);
		container.add(txtAuthor);
		
		lblMessage = new JLabel("Message:");
		container.add(lblMessage);
		
		txtMessage = new JTextField(40);
		container.add(txtMessage);
		
		lblMessageArea = new JLabel("Mensajes Blog:");
		container.add(lblMessageArea);
		
		btnPutMessage = new JButton("Put Message");
		container.add(btnPutMessage);
		
		btnDeleteMessage = new JButton("Delete Message");
		container.add(btnDeleteMessage);
		
		btnSearchAuthor = new JButton("Search by Author");
		container.add(btnSearchAuthor);
		
		btnLastTen = new JButton("Show Last Ten");
		container.add(btnLastTen);
		
		messageArea = new JTextArea(10,40);
		container.add(messageArea);
		
	}
	
	public boolean action( Event evt,Object obj ) {
		
        if( evt.target.equals( btnPutMessage ) )
        {
        	Message message1 = new Message();
        	
        	message1.setAuthor( txtAuthor.getText() );
        	
        	message1.setMessage( txtMessage.getText() );
        	
        	blog.put(blog.lastKey() + 1 , message1);
        	
            System.out.println( "Se ha agregado el mensaje" );
        }
        
        if( evt.target.equals( btnDeleteMessage ) )
        {
        	blog.remove(txtMessage.getText());
        	
            System.out.println( "Se ha eliminado mensaje " + txtMessage.getText());
        }
        
        if( evt.target.equals( btnSearchAuthor ) )
        {
        	int x = 0;
        	
        	Message message = new Message();
        	
    		ArrayList<String> authorMessage = new ArrayList<String>();
    	
    		authorMessage = Blog.getAuthorMessage(txtAuthor.getText());
    		
    		// Get an iterator
    		Iterator i = authorMessage.iterator();
    		// Display elements
    		while( i.hasNext() ) 
    		{
        	     			
    			Map.Entry me = (Map.Entry)i.next();
             
    			message = blog.get(me.getKey());

    			x = x + 1;
    				
    			messageArea.insert(message.getAuthor(), x);
    				
    			x = x + 1;
    				
    			messageArea.insert(message.getMessage(), x);
    				
    			System.out.println(me.getKey() + ": " + message.getMessage());
    			
    		}
        	
            System.out.println( "Se han mostrado los mensajes del author" );
            
        }
        
        if( evt.target.equals( btnLastTen ) )
        {
        	int x = 0;
        	
        	Message message = new Message();
        	
    		ArrayList<String> lastTen = new ArrayList<String>();
    	
    		lastTen = Blog.LastTenMessages();
    		
    		// Get an iterator
    		Iterator i = lastTen.iterator();
    		// Display elements
    		while( i.hasNext() ) 
    		{
        	     			
    			Map.Entry me = (Map.Entry)i.next();
             
    			message = blog.get(me.getKey());

    			x = x + 1;
    				
    			messageArea.insert(message.getAuthor(), x);
    				
    			x = x + 1;
    				
    			messageArea.insert(message.getMessage(), x);
    				
    			System.out.println(me.getKey() + ": " + message.getMessage());
    			
    		}
        	
            System.out.println( "Se mustran los ultimos 10 mensajes" );
        }

        return true;
        }
}
