package connectionBuilder.ConcreteBuilders;

import connectionBuilder.ConnectionBuilder;
import connectionBuilder.Product.Connection;

public class SqlServerConnectionBuilder implements ConnectionBuilder{

	private Connection connection = new Connection();
	
	@Override
	public void buildPort(Integer port) {
		connection.port = port;
		
	}
	
	public void buildPort() {
		// Assuming 9090 as the default port for SqlServer connections
		this.buildPort(9090);
	}

	@Override
	public void buildServerSoft() {
		connection.serverSoft = "SqlServer";
		
	}

	@Override
	public Connection getConnection() {
		return connection;
	}

}
