import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements DBBuilder{

	private Book a;
	
	public DBConnection(){
		a = new Book();
	}
	
	@Override
	public Book getOne(int id) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public Book[] GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(Book a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Insert(Book a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
