package abstractFactory;

public class FactoriesGenerator {

	public ConnectionFactory getFactory(String factoryToGet){
		
		switch(factoryToGet){
			case "type":
				return new ConnectionTypeFactory();
			case "scope":
				return new ConnectionScopeFactory();
			default: 
				return null;
		}
	}
	
}
