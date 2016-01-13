public class Demo {

  public static void main(String[] args) {

 
    DatabaseType databaseType = DatabaseType.MYSQL;
    ConnectionFactory connectionFactory = 
             getConnectionFactory(databaseType);

    ConnectionDb application = new ConnectionDb(connectionFactory);
    application.start();
  }
/* In this case, 
  the type of database we look
  for a private static method and an enum.*/
  private static ConnectionFactory getConnectionFactory(
      DatabaseType databaseType) {
    switch (databaseType) {
    case MYSQL:
      return new MySqlConnectionFactory();
    default:
      return new PostgreSqlConnectionFactory();
    }
  }

  private enum DatabaseType {
    MYSQL, POSTGRE;
  }

}