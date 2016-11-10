package abstractFactory.ConnectionScopes;

import java.util.logging.Logger;

import abstractFactory.ConnectionScope;

public class RemoteConnection implements ConnectionScope{

	private Logger log = Logger.getLogger("test");

	@Override
	public void tellScope() {
		log.info("i'm a remote connection");
	}
}
