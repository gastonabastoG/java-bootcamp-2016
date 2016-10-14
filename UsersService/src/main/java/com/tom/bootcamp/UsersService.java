package com.tom.bootcamp;

public interface UsersService {

	public void createUser(String username, String password);
	
	public void deleteUser(String username);
	
	public void updateUser(String username, String newUsername, String newPassword);
	
	public User getUser(String username);
	
	
}
