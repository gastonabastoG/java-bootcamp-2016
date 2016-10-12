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

}
