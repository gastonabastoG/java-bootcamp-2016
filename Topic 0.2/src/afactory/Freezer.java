package afactory;

public class Freezer extends Product{

	@Override
	public Product getOne(int id) {
		// TODO Auto-generated method stub
		System.out.println("It returns the Freezer product with specified id");
		return null;
	}

	@Override
	public Product[] GetAll() {
		// TODO Auto-generated method stub
		System.out.println("It returns all the Freezer products in the database");
		return null;
	}

	@Override
	public void Update(Product a) {
		System.out.println("It update the Freezer product whit another one");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Insert(Product a) {
		// TODO Auto-generated method stub
		System.out.println("It insert a new Freezer product into the data base");
		
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("It delete a Freezer product with specified id");
		
	}

}
