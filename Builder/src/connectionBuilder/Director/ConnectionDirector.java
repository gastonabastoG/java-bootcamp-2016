package connectionBuilder.Director;

import connectionBuilder.ConnectionBuilder;
import connectionBuilder.Product.Connection;

public class ConnectionDirector {

	private ConnectionBuilder builder = null;
	
	public ConnectionDirector(ConnectionBuilder paramBuilder){
		this.builder = paramBuilder;
	}
	
	public void startConnection(Integer port){
		this.builder.buildPort(port);
		this.builder.buildServerSoft();
	}
	
	public void startConnection(){
		this.builder.buildPort();
		this.builder.buildServerSoft();
	}
	public Connection getConnection(){
		return this.builder.getConnection();
	}
	
}
