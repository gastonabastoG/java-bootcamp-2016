package com.tom.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class UsersServiceImplementation implements UsersService{

	List<User> usersList = new ArrayList<User>();
	
	public void createUser(String username, String password) {
		User userToAdd= new User(username, password);
		usersList.add(userToAdd);
		//TODO validate that username is unique
	}

	public void deleteUser(String username) {
		User userFound = null;
		for (User user : usersList)
			if(user.username.equals(username)){
				userFound = user;
			}
			usersList.remove(userFound);
	}

	public void updateUser(String username, String newUsername, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(String username) {
		for (User user : usersList)
			if(user.username.equals(username))
				return user;
		
		return null;
	}

}
