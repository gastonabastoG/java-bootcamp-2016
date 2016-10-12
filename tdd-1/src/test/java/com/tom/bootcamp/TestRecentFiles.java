package com.tom.bootcamp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRecentFiles {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void firstRunEmptyness() {
		assertTrue(App.listRecentFiles().isEmpty());
	}
	
	@Test
	public void openingFileTest() {
		App.openFile("exampleFile");
		boolean successfullyAdded= false;
		if(App.listRecentFiles().contains("exampleFile")){
				successfullyAdded = true;
			}
		
			assertTrue(successfullyAdded);
	}
	
	@Test
	public void existingFile(){
		App.openFile("file1");
		App.openFile("file2");
		//this should send file1 to the beggining of the list
		App.openFile("file1");
		assertTrue(App.listRecentFiles().get(0).equals("file1"));
	}
	
	@Test
	public void removesLastFile() {
		for(Integer i = 0 ; i<15 ; i++){
			App.openFile("file"+i.toString());
		}
		String lastFile = App.listRecentFiles().get(14);
		App.openFile("thisFile");
		assertTrue(!App.listRecentFiles().get(14).equals(lastFile));
	}
}
