
public class Proxy {
	MySqlConnect mysqlconnect;
	public Proxy() {
		System.out.println("Creating proxy.. ");
	}
	public void Connect(){
		if(mysqlconnect==null){
			mysqlconnect= new MySqlConnect();
		}
		mysqlconnect.connect();
	}
}
