package org.globant.topic2.e02;

import java.util.Scanner;

import org.globant.topic2.e02test.BlogManagerTest;

public class AddPost {
	public PostObject[] addNewPost(){
		
		PostObject[] post = BlogManagerTest.getPost();
		String newTitle, newDate,newText;
		
		int count =0; 
		for (int i = 0; i <= post.length-1 ; i++){
			if (post[i].title != null){
				count++;
			}
		}
		//get the new title, date and text and added to the array	
		System.out.println("write a title: ");	
		Scanner scanTitle = new Scanner(System.in);
		newTitle = scanTitle.next();
		
		System.out.println("write a date: ");	
		Scanner scanDate = new Scanner(System.in);
		newDate = scanDate.next();
		
		System.out.println("write a text: ");	
		Scanner scanText = new Scanner(System.in);
		newText = scanText.next();
		
		
		post[count]= new PostObject(newTitle, newDate, newText, true);
		
		return post;
		
	}
	
}
