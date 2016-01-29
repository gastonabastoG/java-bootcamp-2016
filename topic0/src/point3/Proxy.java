package point3;

public class Proxy implements CrudI {

	private Crud c;

	public Proxy(Crud c) {
		this.c = c;
	}

	public void update() {
		System.out.println("using Proxy");
		c.update();
	}



}



