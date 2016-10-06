package singletonTest;

public class Test {
	
	public static void main(String[] args){
		DbConnectionInstance connection = DbConnectionInstance.getConnection();
		connection.talk();
	}
}
