package abstractFactory;

abstract class ConnectionFactory {

	abstract ConnectionScope getScope(String scope);
	abstract ConnectionType getType(String scope);
	
}
