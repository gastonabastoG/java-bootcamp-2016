package abstractFactory;

import abstractFactory.ConnectionScopes.LocalConnection;
import abstractFactory.ConnectionScopes.RemoteConnection;

public class ConnectionScopeFactory extends ConnectionFactory{
	@Override
	public ConnectionScope getScope(String scope){
		
		if(scope.equals("remote"))
			return new RemoteConnection();
		else
			if(scope.equals("local"))
				return new LocalConnection();
			else
				return null;
	}

	@Override
	ConnectionType getType(String scope) {
		return null;
	}
}
