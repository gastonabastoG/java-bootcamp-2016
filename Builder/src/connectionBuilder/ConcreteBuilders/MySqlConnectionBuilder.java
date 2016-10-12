package connectionBuilder.ConcreteBuilders;

import connectionBuilder.ConnectionBuilder;
import connectionBuilder.Product.Connection;

public class MySqlConnectionBuilder implements ConnectionBuilder{

	private Connection connection;
	
	public MySqlConnectionBuilder(){
		connection = new Connection();
	}
	
	@Override
	public void buildPort(Integer port) {
		connection.port = port;
	}
	
	public void buildPort() {
		// Assuming 8080 is the default port for MySql connections
		this.buildPort(8080);
	}

	@Override
	public void buildServerSoft() {
		connection.serverSoft = "MySql";
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

	
}
