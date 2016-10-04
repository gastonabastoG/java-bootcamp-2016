package abstractFactory;

public class Demo {
	
	public static void main(String[] args){
		FactoriesGenerator gen = new FactoriesGenerator();
		
		ConnectionFactory connectionTypeFactory = gen.getFactory("type");
		ConnectionType ssConnection = connectionTypeFactory.getType("sqlserver");
		ssConnection.tellType();
		ConnectionType msConnection = connectionTypeFactory.getType("mysql");
		msConnection.tellType();
		ConnectionType oracleConnection = connectionTypeFactory.getType("oracle");
		oracleConnection.tellType();
	}
}
