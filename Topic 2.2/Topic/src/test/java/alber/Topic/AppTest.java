package alber.Topic;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	  private App app;
	  private Blog blog;

	  
	  public void setUp() throws Exception {
	    // NiceMocks return default values for
	    // unimplemented methods
	    app = createNiceMock(App.class);
	    blog = new Blog();
	  }
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	
        assertTrue( true );
    }
}
