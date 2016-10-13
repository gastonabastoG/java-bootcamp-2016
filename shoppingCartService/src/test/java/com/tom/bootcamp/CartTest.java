package com.tom.bootcamp;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CartTest {

	private CartImplementation testImp = new CartImplementation();
	
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
	public void canAdd() {
		testImp.addToCart("this item");
		assertTrue(testImp.listCart().contains("this item"));
	}
	
	@Test
	public void canDelete() {
		//add an item to guarantee the list has at least 1 item to test
		 testImp.addToCart("dummy item");
		
		String itemToDelete = testImp.listCart().get(0);
		testImp.deleteFromCart(0);
		assertTrue(!testImp.listCart().contains(itemToDelete));
	}
	
	@Test
	public void canFinish() {
		if(testImp.listCart().size() == 0){
			testImp.addToCart("item1");
			testImp.addToCart("item2");
		}
			testImp.finishBuy();
			assertTrue(testImp.listCart().size() == 0);
	}
	

}
