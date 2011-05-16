package foo;

import static org.junit.Assert.*;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

public class FooTest {

	private InitialContext initialContext;

	@Before
    public void setUp() throws Exception {
		System.out.println("Setup");
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	@Test
	public void testSayHello() throws Exception
	{
		BarLocal barLocal = (BarLocal)initialContext.lookup("/BarImplLocal");
		assertTrue(barLocal!=null);
	}
}
