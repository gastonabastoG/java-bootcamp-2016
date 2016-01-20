package proxy;
import java.sql.SQLException;

public class ProxyDemo {

	public static String url = "jdbc:mysql://localhost:3307/tonchovet?autoReconnect=true";
	 public static String user = "tonchovet";
	 public static String pass = "alberto7"; 
	 
	public static void main(String[] args) throws SQLException {

		Proxy proxy = new Proxy();

		DBAdapterFast bdAdapterFast = new DBAdapterFast();
		bdAdapterFast.getDBConnection(url, user, pass);

		proxy.BDConnection(url, user, pass);

	}

}
