package foo;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.TestCase;

import org.junit.Test;

public class StatelessTest extends TestCase {
	
	public void testCheckStateless() throws Exception
	{
		Properties prop = new Properties();
		prop.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");
		
		InitialContext ic = new InitialContext(prop);
		ic.lookup("BarImplRemote");
	}
}
