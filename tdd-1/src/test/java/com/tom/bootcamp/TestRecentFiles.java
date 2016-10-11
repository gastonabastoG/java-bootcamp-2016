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
		App.addFile("exampleFile");
		boolean successfullyAdded= false;
		if(App.listRecentFiles().contains("exampleFile")){
				successfullyAdded = true;
			}
		
			assertTrue(successfullyAdded);
	}
	
	@Test
	public void existingFile(){
		App.addFile("file1");
		App.addFile("file2");
		//this should send file1 to the beggining of the list
		App.addFile("file1");
		assertTrue(App.listRecentFiles().get(0).equals("file1"));
	}

}
