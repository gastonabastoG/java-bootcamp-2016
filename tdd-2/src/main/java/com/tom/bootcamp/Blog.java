package com.tom.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Blog {

	private static List<String> blogEntries = new ArrayList<String>();
	
	public static List<String> getEntries(){
		return blogEntries;
	}
	
	public static void postEntry(String entry){
		blogEntries.add(entry);
	}
	
	
	public static void deleteEntry(String element){
		blogEntries.remove(element);
	}
	
	public static List<String> getRecentEntries(){
		List<String> recentEntries = new ArrayList<String>();
		for(Integer i=1;i<=10;i++){
			recentEntries.add(Blog.getEntries().get(i));
		}
		
		return recentEntries;
	}
	
}
