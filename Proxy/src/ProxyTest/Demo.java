package ProxyTest;

public class Demo {

	public static void main(String[] args){
		DbProxy proxy = new DbProxy();
		proxy.tryConnection("123");
	}
}
