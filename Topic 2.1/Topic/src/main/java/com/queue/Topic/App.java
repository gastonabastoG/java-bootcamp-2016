package com.queue.Topic;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws URISyntaxException
    {
    	
    	Queue<File> q = new ArrayDeque<File>();
    	
    	
    	
    	URI file1URI = new URI("C:\\Users\\alber\\workspace\\java-bootcamp-2016\\Topic 2.1\\Topic\\file1");
    	File file1 = new File(file1URI);
    	
        System.out.println( "Hello World!" );
    }
}
