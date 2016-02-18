package org.Topic2;

import org.easymock.EasyMock;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
    extends TestCase
{
	Message mess = EasyMock.createMock( Message.class);
	
	private MessageHandler messageHandlerMock;
	
    @Before
    public void setUp(){
    	
    	messageHandlerMock = EasyMock.createMock( MessageHandler.class);
    	
    	EasyMock.expect(messageHandlerMock.getMessage(1)).andReturn(new Message("alber", "algo pusieron primero"));
    	
    	EasyMock.expect(messageHandlerMock.getMessage(1)).andReturn(new Message("fabricio", "algo pusieron despues"));
    	
    	EasyMock.expect(messageHandlerMock.getMessage(1)).andReturn(new Message("alber", "algo pusieron despues de eso"));
    	
    	EasyMock.replay(messageHandlerMock);
    	
    }
    
    @Test
    public void testBl(){
    	
    	Blog bl = new Blog();
    	bl.setMessageHandler(messageHandlerMock);
    	assertEquals(3, bl.saveMessage());
    }
}
