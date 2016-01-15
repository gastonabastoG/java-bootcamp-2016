import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BDAdapter {
	
	Connection con = null;
	
	public Connection BDConnection ( String url, String user, String pass ) throws SQLException
	{
		return con = DriverManager.getConnection(url, user, pass);
	}
}
