import java.sql.Connection;
import java.sql.SQLException;

public class Proxy {
	
	BDAdapterSlow bdAdapterSlow;
	
	public Connection BDConnection ( String url, String user, String pass ) throws SQLException
	{
		if ( bdAdapterSlow == null )
		{
			bdAdapterSlow = new BDAdapterSlow();
		}
		return null;
		
	}
}
