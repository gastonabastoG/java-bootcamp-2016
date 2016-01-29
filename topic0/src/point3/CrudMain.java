package point3;

public class CrudMain {

	public static void main(String[] args) {
		
		Crud crud = new Crud();
		CrudI c = new Proxy(crud);
		
		c.update();
		
		
	}
	
}
