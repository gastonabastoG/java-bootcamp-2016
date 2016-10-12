package abstractFactory;

import abstractFactory.ConnectionTypes.MySql;
import abstractFactory.ConnectionTypes.Oracle;
import abstractFactory.ConnectionTypes.SqlServer;

public class ConnectionTypeFactory extends ConnectionFactory{

	@Override
	ConnectionScope getScope(String scope) {
		return null;
	}

	@Override
	ConnectionType getType(String type) {
		switch (type){
		case "mysql": 
			return new MySql();
		case "oracle":
			return new Oracle();
		case "sqlserver":
			return new SqlServer();
		default:
			return null;
		}
	}
}
