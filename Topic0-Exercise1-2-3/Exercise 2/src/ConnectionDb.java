public class ConnectionDb {

  private  ConnectionFactory connectionFactory;

  public ConnectionDb(ConnectionFactory connectionFactory) {
    this.connectionFactory = connectionFactory; 
  }

  public void start() {
    Connection connection = connectionFactory.getConnection();
    connection.connect();
  
  }

}