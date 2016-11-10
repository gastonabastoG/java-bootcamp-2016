package abstractFactory.ConnectionScopes;

import java.util.logging.Logger;

import abstractFactory.ConnectionScope;

public class LocalConnection implements ConnectionScope {
	
	private Logger log = Logger.getLogger("Test");
	
	@Override
	public void tellScope(){
		log.info("i'm a local connection.");
	}
}
