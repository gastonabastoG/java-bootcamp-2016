package org.globant.topic2.e01;

import java.util.Scanner;

import org.globant.topic2.e01test.RecentFileTest;

public class SortedList {

	public int[] sortedList() {
		
		int[] list = RecentFileTest.getList();

		Scanner scan = new Scanner(System.in);

		int fileNumber = scan.nextInt();
		
		for (int i = 0; i <= 14; i++) {
			if (list[i] == fileNumber) {
				
				int[] listAux = new int[i];
				for (int j = 0; j <= list[i] - 1; j++) {
					listAux[j] = list[j];
				}
				list[0] = list[i];
				for (int j = 1; j <= list[i]; j++) {
					list[j] = listAux[j - 1];
				}
				
			} else if (fileNumber>14){
				int[] listAux = new int[15];
				
				for (int j = 0; j <= 13; j++) {
					listAux[j] = list[j];
				}
				for (int j = 1; j <= 14; j++) {
					
					list[j] = listAux[j - 1];
				
			
				}
				list[0]=fileNumber;
				break;
			}
	
		}

		return list;
	}

}
