import java.sql.SQLException;

public class ProxyDemo {

	public static String url = "jdbc:mysql://localhost:3307/tonchovet?autoReconnect=true";
	 public static String user = "tonchovet";
	 public static String pass = "alberto7"; 
	 
	public static void main(String[] args) throws SQLException {

		Proxy proxy = new Proxy();

		BDAdapterFast bdAdapterFast = new BDAdapterFast();
		bdAdapterFast.BDConnection(url, user, pass);

		proxy.BDConnection(url, user, pass);

	}

}
