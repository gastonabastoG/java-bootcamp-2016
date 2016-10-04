package singletonTest;

public class Test {
	
	public static void main(String[] args){
		DbConnectionInstance connection0 = DbConnectionInstance.getConnection("8080");
		DbConnectionInstance connection1 = DbConnectionInstance.getConnection("4512");
		DbConnectionInstance connection2 = DbConnectionInstance.getConnection("9000");
	}
}
