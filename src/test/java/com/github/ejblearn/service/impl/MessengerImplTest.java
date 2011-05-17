package com.github.ejblearn.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameNotFoundException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ejblearn.service.Messenger;

public class MessengerImplTest {
	
	private static InitialContext initialContext;
	
	
	@BeforeClass
    public static void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	
	@Test
	public void localLookupBasedOnAnnotatedName() throws Exception
	{
		Messenger messenger = (Messenger) initialContext.lookup("messengerBeanLocal");
		assertTrue(messenger!=null);
	}
	
	@Test(expected=NameNotFoundException.class)
	public void remoteLookupOnLocalBeanShouldThrowException() throws Exception
	{
		Messenger messenger = (Messenger) initialContext.lookup("messengerBeanRemote");
		assertTrue(messenger!=null);
	}


}
