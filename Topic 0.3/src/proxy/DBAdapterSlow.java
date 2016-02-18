package proxy;

public class DBAdapterSlow extends DBAdapter{

	public DBAdapterSlow(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
