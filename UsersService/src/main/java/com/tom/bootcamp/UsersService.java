package com.tom.bootcamp;

public interface UsersService {

	/**
	 * method to create users
	 * 
	 * @param username username to set
	 * @param password password to set
	 */
	
	public void createUser(String username, String password);
	
	/**
	 * method to delete users
	 * 
	 * @param username username of the user to delete
	 */
	
	public void deleteUser(String username);
	
	/**
	 * method to modify a user
	 * 
	 * @param username current username of the user to modify
	 * @param newUsername new username, if username is not going to be modified use null instead of this parameter
	 * @param newPassword new password, if password is not going to be modified use null instead of this parameter
	 */
	
	public void updateUser(String username, String newUsername, String newPassword);
	
	/**
	 * method to get a single user
	 * 
	 * @param username user to find
	 * @return user the full user object
	 */
	
	public User getUser(String username);
	
	
}
