package org.globant.topic2.e01test;

import org.globant.topic2.e01.SortedList;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecentFileTest {

	static int[] list = null;

	@Test
	public void showEmptyList() {

		
		int[] list = null;
		if (list == null) {
			System.out.println("The list of files is empty");
		}

	}

	@BeforeClass

	public static void initList() {

		list = new int[15];
		for (Integer i = 0; i <= 14; i++) {
			list[i]= i;
		}
	}

	@Test
	public void showFillList() {
		
		for (int i = 0; i <= 14; i++)  {
			System.out.println("the number of files is : " + list[i]);
			
		}
	}
	
	
	@Test
	public void showListSortedByMostRecentFile(){
		
		SortedList sortedList = new SortedList();
		sortedList.sortedList();
		
		int index = 0;
		 for (int i = 0; i <= 14; i++)   {
			System.out.println("the number of files is : " + list[i]);
			index++;
		}
		
	}

	public static int[] getList() {
		return list;
	}

	public static void setList(int[] list) {
		RecentFileTest.list = list;
	}
	
	
	
	
	

}
