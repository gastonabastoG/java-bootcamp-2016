package org.globant.topic2.e02test;

import static org.junit.Assert.*;

import org.globant.topic2.e02.AddPost;
import org.globant.topic2.e02.DeletedFile;
import org.globant.topic2.e02.PostObject;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlogManagerTest {

	static PostObject post[] = new PostObject[100];

	// inicialize an array whit 10 objects
	@BeforeClass
	public static void init() {
		post[0] = new PostObject("title 1", "01/01/2016", "text 1", true);
		post[1] = new PostObject("title 2", "02/01/2016", "text 2", true);
		post[2] = new PostObject("title 3", "03/01/2016", "text 3", true);
		post[3] = new PostObject("title 4", "04/01/2016", "text 4", true);
		post[4] = new PostObject("title 5", "05/01/2016", "text 5", true);
		post[5] = new PostObject("title 6", "06/01/2016", "text 6", true);
		post[6] = new PostObject("title 7", "07/01/2016", "text 7", true);
		post[7] = new PostObject("title 8", "08/01/2016", "text 8", true);
		post[8] = new PostObject("title 9", "09/01/2016", "text 9", true);
		post[9] = new PostObject("title 10", "10/01/2016", "text 10", true);
		for (int i =10 ; i<= post.length-1;i++){
			post[i] = new PostObject(null, null, null, true);
		}

	}
	//show the object's array 
	@Test
	public void showObjectsArray() {
		for (int i = 0; i <= 9; i++) {
			System.out.println(
					"the title is :" + post[i].title + " the date is : " + post[i].date + " text: " + post[i].text);
		}	
	}
	
	@Test
	public void addNewPostTest(){
		
		AddPost addpost = new AddPost();
		addpost.addNewPost();
		
		//show all the posts
		for (int i = 0; i <= 10; i++) {
			System.out.println(
					"the title is :" + post[i].title + " the date is : " + post[i].date + " text: " + post[i].text);
		}	
		
		
		
	}
	
	@Test
	public void deleteAFile(){
		DeletedFile deletedFile = new DeletedFile(); 
		deletedFile.deletedFile();
		//show the deleted file whit a false state
		for (int i = 0; i <= 10; i++) {
			System.out.println(
					"the title is :" + post[i].title + " the date is : " + post[i].date + " text: " + post[i].text+" state : "+ post[i].state);
		}
	}
	
	@Test
	public void Show10MostrRecentEntries(){
		
		int count = 0;
		while (count<=10){
			if (post[count].state==true){
				System.out.println(
						"the title is :" + post[count].title + " the date is : " + post[count].date + " text: " + post[count].text);
				count++;
			}else{
				count++;
			}
			}
		}
		
		
	
	
	
	public static PostObject[] getPost() {
		return post;
	}
	public static void setPost(PostObject[] post) {
		BlogManagerTest.post = post;
	}

}
