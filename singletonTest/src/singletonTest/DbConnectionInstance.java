package singletonTest;

import java.util.logging.Logger;

public class DbConnectionInstance {
	
	private String port;
	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public DbConnectionInstance(String portNumber){
		this.setPort(portNumber);
	}
	
	public static DbConnectionInstance getConnection(String portToSet){
		Logger l = Logger.getLogger("test");
		l.info("Connecting at port: "+portToSet);
		return new DbConnectionInstance(portToSet);
	}
	
}
