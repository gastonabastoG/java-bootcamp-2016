package topic4;

import java.sql.*;

public class ex7 
{

	public static void main(String[] args) throws Exception 
	{
		
		try 
		{

			System.out.println("trying to connect to the server ");
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/highschool", "root", "Globant2016");
			System.out.println("successful connection");

			/*
			 * // create our mysql database connection // String myDriver =
			 * "org.gjt.mm.mysql.Driver"; String myUrl =
			 * "jdbc:mysql://localhost/highschool"; // Class.forName(myDriver);
			 * Connection conn = DriverManager.getConnection(myUrl, "root",
			 * "Globant2016");
			 */

			// our SQL SELECT query.
			// if you only need a few columns, specify them by name instead of
			// using "*"
			String query = "SELECT * FROM course";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next()) 
			{
				int tId = rs.getInt("tId");
				String name = rs.getString("name");
				String hour = rs.getString("hour");
				String date= rs.getString("days");
				

				// print the results
				System.out.format("%s, %s, %s, %s\n", tId, name, hour, date);
			}
			st.close();
		} 
		
		catch (SQLException e) 
		{
			throw e;
		}
	}
}