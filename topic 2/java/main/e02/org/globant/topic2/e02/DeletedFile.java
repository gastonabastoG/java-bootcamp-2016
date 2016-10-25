package org.globant.topic2.e02;

import java.util.Scanner;

import org.globant.topic2.e02test.BlogManagerTest;

public class DeletedFile {
	public PostObject[] deletedFile(){
		
		PostObject[] post = BlogManagerTest.getPost();
		int deletedFileNumber=-1;
		//get the number of the file that will be deleted and set the state to false
		System.out.println("insert the deleted post's number: ");
		Scanner scan = new Scanner(System.in);
		deletedFileNumber =scan.nextInt();
		post[deletedFileNumber-1].state =false;
		
		
		
		return post;
		
	}

}
