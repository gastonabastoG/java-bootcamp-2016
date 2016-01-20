package afactory;

public abstract class DBConnection {
	
	public abstract Product getOne( int id );
	
	public abstract Product[] GetAll ();
	
	public abstract void Update( Product a );
	
	public abstract void Insert( Product a );
	
	public abstract void Delete( int id );
	
}
