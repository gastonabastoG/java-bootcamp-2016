package org.tom.finalProject.User;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.MongoClient;

public class UserDAO extends BasicDAO{

	protected UserDAO(MongoClient mongoClient, Morphia morphia, String dbName) {
		super(mongoClient, morphia, dbName);
		// TODO Auto-generated constructor stub
	}
}
