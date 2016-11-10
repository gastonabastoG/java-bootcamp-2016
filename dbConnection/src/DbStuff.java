
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbStuff {
	
	
	public void doDbStuff() throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/high_school", "root", "Globant2016");
			statement = connection.createStatement();
			result = statement.executeQuery("select concat_ws('',last_name,', ',first_name) 'Teacher' from teachers where id=1;");
			while(result.next()){
				 System.out.println("Teacher: "+result.getString(1));
			}
			result = statement.executeQuery("select concat_ws('', start_time ,' - ',finish_time) 'Schedules' from teacherschedules inner join schedules on teacherschedules.teacher=teacher where teacher=1;");
			System.out.println("Schedules: ");
			while(result.next()){
				 System.out.println(result.getString(1));
			}
		} catch (Exception ex) {
			throw ex;
		}
	}

}
