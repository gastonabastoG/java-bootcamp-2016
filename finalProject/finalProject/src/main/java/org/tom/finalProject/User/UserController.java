package org.tom.finalProject.User;

import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Map.Entry;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;

@RestController
public class UserController {
	
	MongoClient mongo   	= new MongoClient();
	Morphia 	morphia 	= new Morphia();
	String 		db			= new String("cartApiDb");
	Datastore 	ds			= morphia.createDatastore(mongo, db);
	UserDAO 	userDAO		= new UserDAO(mongo, morphia, db);
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/users")
	public String createUser(@RequestBody Map<String, String> userData) throws NoSuchAlgorithmException{
		String password = null, username = null;
		for(Entry<String, String> entry : userData.entrySet()){
			switch (entry.getKey()){
			case "password": password = entry.getValue().toString();
			break;
			case "username": username = entry.getValue().toString();
			break;
					}
		}
		User user = new User(username, password);
		userDAO.save(user);
		return "Registered user";
	}
}
