package afactory;

public class TV extends Product{

		@Override
		public Product getOne( int id )
		{
			System.out.println("It returns the TV product with specified id");
			return new TV();
		}

		@Override
		public Product[] GetAll() {
			// TODO Auto-generated method stub
			System.out.println("It returns all the TV products in the database");
			return null;
			
		}

		@Override
		public void Update(Product a) {
			// TODO Auto-generated method stub
			System.out.println("It update the TV product whit another one");
		}

		@Override
		public void Insert(Product a) {
			// TODO Auto-generated method stub
			System.out.println("It insert a new TV product into the data base");
			
		}

		@Override
		public void Delete(int id) {
			// TODO Auto-generated method stub
			System.out.println("It delete a TV product with specified id");
		}
			
	

}
