import java.sql.ResultSet;
import java.sql.Statement;


public class Demo {
public static void main(String[] args) {
		
		try{
		
			
		
		ConnectionDb con = ConnectionDb.getInstance();
		
		Statement stmt =  con.getConnect().createStatement();
		
		String query = "select * from library" ; //I query the database
		ResultSet rs = stmt.executeQuery(query) ;
		
		while (rs.next())
		{
		    System.out.println (""); //while there is data, I show data
		}
		}catch(Exception e){
			e.printStackTrace();
			
		}


		
	}

}
