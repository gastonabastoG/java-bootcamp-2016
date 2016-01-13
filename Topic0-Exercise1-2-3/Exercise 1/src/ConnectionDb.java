import java.sql.*;
public class ConnectionDb {

	private static Connection con=null;
	private static ConnectionDb instance;
	private ConnectionDb(){
		
	}
	public static Connection Connect() {
		try	{
	 Class.forName("com.mysql.jdbc.Driver").newInstance(); 
	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise1", "root", null);
	 } catch(Exception e) {
			e.printStackTrace(); //If the connection fails, I show error.
		}
		return con;
	}
	public static ConnectionDb getInstance(){
		if(instance==null) { //If the instance is null, I create a new instance
			System.out.print("The instance was created ");
			instance = new ConnectionDb();
		}
		return instance;
		}
	public static Connection getConnect() {
		return con;
	}

	public static void setConnect(Connection conn) {
		ConnectionDb.con = conn;
	}
	
}
