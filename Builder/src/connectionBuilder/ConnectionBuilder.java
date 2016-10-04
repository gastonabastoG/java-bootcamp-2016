package connectionBuilder;

import connectionBuilder.Product.Connection;

public interface ConnectionBuilder {

	public void buildPort(Integer port);
	public void buildPort();
	public void buildServerSoft();
	public Connection getConnection();
}
