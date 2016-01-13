
public class PostgreSqlConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return new PostgreSqlConnection();
	}

}
