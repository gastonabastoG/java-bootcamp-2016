package org.tom.finalProject.Article;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.MongoClient;

public class ArticleDAO extends BasicDAO<Article, ObjectId> {

	public ArticleDAO(MongoClient mongoClient, Morphia morphia, String dbName) {
		super(mongoClient,morphia,dbName);
	}
	
}
