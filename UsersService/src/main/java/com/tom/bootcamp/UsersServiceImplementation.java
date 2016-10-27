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
		User userFound = null;
		Integer index = null;
		for (User user : usersList)
			if(user.username.equals(username)){
				userFound = user;
				index = usersList.indexOf(user);
			}
		if(userFound != null){
			
			if(newPassword != null){
				userFound.setPassword(newPassword);
			}
			if(newUsername != null){
				userFound.setUsername(newUsername);
			}
		}
		usersList.set(index, userFound);
	}

	public User getUser(String username) {
		for (User user : usersList)
			if(user.username.equals(username))
				return user;
		
		return null;
	}

}
