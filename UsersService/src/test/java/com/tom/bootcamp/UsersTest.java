package com.tom.bootcamp;

import static org.junit.Assert.*;


import org.junit.Test;

public class UsersTest {

	UsersServiceImplementation imp = new UsersServiceImplementation();
	
	@Test
	public void canCreate() {
		imp.createUser("test", "testPassword");
		User userToGet = imp.getUser("test");
		assertTrue(userToGet.getPassword().equals("testPassword") && userToGet.getUsername().equals("test"));
	}

}
