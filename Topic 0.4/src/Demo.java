
public class Demo {

	public static void main(String[] args) {

		DBBuilder dbBuilder = new DBConnection();
		DBDirector dbDirector = new DBDirector(dbBuilder);
		dbDirector.constructBDConnection();
		Book book = dbDirector.getBook();
		System.out.println("meal is: " + book.toString() );
	}
	
}
