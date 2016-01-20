package proxy;
import java.sql.Connection;
import java.sql.SQLException;

public class Proxy {
	
	DBAdapterSlow bdAdapterSlow;
	
	public Connection BDConnection ( String url, String user, String pass ) throws SQLException
	{
		Connection dbAdapterSlow = null;
		
		if ( bdAdapterSlow == null )
		{
			bdAdapterSlow = new DBAdapterSlow();
		}
		
		return dbAdapterSlow;
		
	}
}
