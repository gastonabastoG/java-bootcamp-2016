package proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DBAdapter {
	
	Connection con = null;
	
	public Connection getDBConnection ( String url, String user, String pass ) throws SQLException
	{
		return con = DriverManager.getConnection(url, user, pass);
	}
}
