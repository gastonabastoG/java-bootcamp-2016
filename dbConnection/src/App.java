public class App {
	
	public static void main(String[] asd) throws Exception{
		DbStuff db = new DbStuff();
		try{
			db.doDbStuff();
		} catch (Exception e){
			throw e;
		}
	}
}
