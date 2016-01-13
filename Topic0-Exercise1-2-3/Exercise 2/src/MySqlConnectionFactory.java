
public class MySqlConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return new MySqlConnection();
	}

}
