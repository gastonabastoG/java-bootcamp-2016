package builder;

public interface DBBuilder {

	public Book getOne( int id );
	
	public Book[] GetAll ();
	
	public void Update( Book a );
	
	public void Insert( Book a );
	
	public void Delete( int id );
}
