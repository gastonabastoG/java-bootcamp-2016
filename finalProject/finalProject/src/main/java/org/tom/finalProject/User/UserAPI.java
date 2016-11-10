package org.tom.finalProject.User;

import org.tom.finalProject.Article.Article;

public interface UserAPI {
	
	public void addItem(Article item);
	public void removeItem(Article item);
	public void buyCart();
	public void chargeCreds(Double cred);
	
}
