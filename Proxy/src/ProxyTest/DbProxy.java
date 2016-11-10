package ProxyTest;

import java.util.logging.Logger;

public class DbProxy {

	Logger log = Logger.getLogger("Test");
	
	public void tryConnection(String key){
		if(key == "123"){
			DbConnection connection = new DbConnection();
			connection.connect();
		} else {
			log.info("Wrong password");
		}
	}
	
}
