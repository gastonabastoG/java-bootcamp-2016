package builder;

public class DBDirector {

	private DBBuilder dbBuilder = null;
	
	int id = 1;
	Book a = new Book();
	
	public DBDirector(DBBuilder dbBuilder) {
		this.dbBuilder = dbBuilder;
	}

	public void constructBDConnection() {
		dbBuilder.Delete(id);
		dbBuilder.GetAll();
		dbBuilder.getOne(id);
		dbBuilder.Update(a);
		dbBuilder.Insert(a);
	}

	public Book getBook() {
		return dbBuilder.getOne(id);
	}
	
}
