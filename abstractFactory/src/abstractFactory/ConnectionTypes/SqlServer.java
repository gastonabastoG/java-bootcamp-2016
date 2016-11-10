package abstractFactory.ConnectionTypes;

import java.util.logging.Logger;

import abstractFactory.ConnectionType;

public class SqlServer implements ConnectionType{

	private Logger log = Logger.getLogger("Test");
	
	@Override
	public void tellType(){
		log.info("i'm connected to SqlServer");
	}

}
