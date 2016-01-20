package singleton;
import java.sql.Connection;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Connection con = DBSingleton.getConnection();
		
	}

}
