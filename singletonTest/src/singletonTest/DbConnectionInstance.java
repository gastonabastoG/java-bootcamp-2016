package singletonTest;


public class DbConnectionInstance {

	private static DbConnectionInstance instance = null;
	
	private DbConnectionInstance(){
	}
	
	public static DbConnectionInstance getConnection(){
		if(instance == null){
			return instance = new DbConnectionInstance();
		}
		return instance;
	}
	
	public void talk(){
		System.out.print("Hi, im a connection");
	}
	
}
