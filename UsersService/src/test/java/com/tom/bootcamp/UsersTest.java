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
	
	@Test
	public void canDelete(){
		imp.createUser("userToDelete", "password");
		imp.deleteUser("userToDelete");
		assertTrue(imp.getUser("userToDelete") == null);
	}

	@Test
	public void canUpdate(){
		imp.createUser("userToUpdate", "password");
		imp.updateUser("userToUpdate", "updatedUser", "updatedPassword");
		User getUser = imp.getUser("updatedUser");
		assertTrue(getUser.getUsername().equals("updatedUser") && getUser.getPassword().equals("updatedPassword"));
	}
}
