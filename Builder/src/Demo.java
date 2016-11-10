
import connectionBuilder.Product.Connection;

import java.util.logging.Logger;

import connectionBuilder.ConcreteBuilders.MySqlConnectionBuilder;
import connectionBuilder.ConcreteBuilders.SqlServerConnectionBuilder;
import connectionBuilder.Director.ConnectionDirector;

public class Demo {
	public static void main(String[] args){
		
		Logger log = Logger.getLogger("Test");
		
		MySqlConnectionBuilder mySqlBuilder = new MySqlConnectionBuilder();
		
		ConnectionDirector director = new ConnectionDirector(mySqlBuilder);
		
		director.startConnection(1234);
		
		Connection mySqlConnection = director.getConnection();
		log.info("Software de servidor: "+mySqlConnection.getServerSoft());
		log.info("Puerto : " +mySqlConnection.getPort().toString());
		
		// esto se comporta raro
		director.startConnection();

		log.info("Software de servidor: "+mySqlConnection.getServerSoft());
		log.info("Puerto : " +mySqlConnection.getPort().toString());
		
		
		SqlServerConnectionBuilder sqlServerBuilder = new SqlServerConnectionBuilder();
		
		director = new ConnectionDirector(sqlServerBuilder);
		director.startConnection(3333);
		Connection sqlServerConnection = director.getConnection();
		
		log.info("Software de servidor: "+sqlServerConnection.getServerSoft());
		log.info("Puerto : " +sqlServerConnection.getPort().toString());
		
		// esto igual
		director.startConnection();
		
		log.info("Software de servidor: "+sqlServerConnection.getServerSoft());
		log.info("Puerto : " +sqlServerConnection.getPort().toString());
		
		
	}
}
