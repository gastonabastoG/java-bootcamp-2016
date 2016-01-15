
public class BDAdapterSlow extends BDAdapter{

	public BDAdapterSlow(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
