package org.tom.finalProject.User;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.MongoClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tom.finalProject.Article.Article;
import org.tom.finalProject.Article.ArticleDAO;



@RestController
public class AppController {
	
	MongoClient 	mongo   	= new MongoClient();
	Morphia 		morphia 	= new Morphia();
	String 			db			= new String("cartApiDb");
	Datastore 		ds			= morphia.createDatastore(mongo, db);
	UserDAO 		userDAO		= new UserDAO(mongo, morphia, db);
	ArticleDAO		articleDAO	= new ArticleDAO(mongo, morphia, db);
	String			authKey 	= new String("thisIsPasswordIsForJWTAuthentication");
	
	
	@RequestMapping(method = RequestMethod.POST, value ="/users")
	public String createUser(@RequestBody Map<String, String> userData) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String password = null, username = null;
		for(Entry<String, String> entry : userData.entrySet()){
			
			switch (entry.getKey()){
				case "password": password = entry.getValue().toString();break;
				case "username": username = entry.getValue().toString();break;
			}
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDAO.save(user);
		return "Registered user";
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/articles")
	public String createArticle(@RequestBody Map<String, String> articleData) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String 	name 	= null;
		Double 	price	= null;
		String	category= null;
		for(Entry<String, String> entry : articleData.entrySet()){
			
			switch (entry.getKey()){
				case "price"	: price = Double.parseDouble(entry.getValue().toString()); break;
				case "name"		: name = entry.getValue().toString();break;
				case "category"	: category = entry.getValue().toString();break;
			}
		}
		Article article = new Article();
		article.setName(name);
		article.setPrice(price);
		article.setCategory(category);
		articleDAO.save(article);
		return "created article";
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/login")
	public String authUser(@RequestBody Map<String, String> userData) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//get the password and username out of the map
		String password = null, username = null;
		for(Entry<String, String> entry : userData.entrySet()){
			switch (entry.getKey().toString()){
				case "username": username = entry.getValue().toString();break;
				case "password": password = entry.getValue().toString();break;
			}
		}
		
		//verify existing user, if it exist, verify password hash, if it matches, return an authentication token
		Query<User> query 	 = ds.createQuery(User.class);
		User 		user	 = query.filter("username", username).limit(1).get();
		if (user != null){
			//MessageDigest crypto = MessageDigest.getInstance("SHA-256");
			//crypto.update(password.getBytes("UTF-8"));
			//System.out.println(crypto.digest());
			System.out.println(user.getPassword());
			if(user.getPassword().equals(password)){
				Date now = new Date();
				String token = Jwts.builder().setId(user.getId().toString()).setIssuedAt(now).signWith(SignatureAlgorithm.HS256, authKey).compact();
				return token;
			}else{
				return "access forbidden";
			}
		} else {
			return "user doesn't exist.";
		}
		
	}

	@RequestMapping(method = RequestMethod.GET, value = "articles/byName/{name}")
	public Article findByName(@PathVariable("name") String name){
		Query<Article> 	query 	= ds.createQuery(Article.class);
		Article 		article	= query.filter("name", name).get();
		return article;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "articles/byCategory/{category}")
	public Article findByCategory(@PathVariable("category") String category){
		Query<Article> 	query 	= ds.createQuery(Article.class);
		Article 		article	= query.filter("category", category).get();
		return article;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "articles/cart")
	public String saveCart(@RequestBody List<ObjectId> productsIds, @RequestParam ObjectId userId){
		Query<Article> 	queryArticle = ds.createQuery(Article.class);
		Query<User> 	queryUser	 = ds.createQuery(User.class).filter("_id", userId);
		User user = queryUser.get();
		for(ObjectId id : productsIds){
			user.addItem(queryArticle.filter("_id", id).get());
		}
		UpdateOperations<User> updateOps = ds.createUpdateOperations(User.class).set("userCart", user.getUserCart());
		userDAO.update(queryUser, updateOps);
		return "Cart saved";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "articles/cart/buy")
	public String buyCart(@RequestParam ObjectId userId){
		Query<User> 	queryUser	 = ds.createQuery(User.class).filter("_id", userId);
		User user = queryUser.get();
		if(user.getUserCart().getTotalPrice() >= user.getCredits()){
			user.buyCart();
			UpdateOperations<User> updateOps = ds.createUpdateOperations(User.class).set("credits", user.getCredits());
			userDAO.update(queryUser, updateOps);
			return "Cart bought";
		} else {
			return "insuficient credits";
		}
	}
}
