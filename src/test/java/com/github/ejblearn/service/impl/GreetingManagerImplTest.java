package com.github.ejblearn.service.impl;

import static org.junit.Assert.*;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ejblearn.service.GreetingManager;


public class GreetingManagerImplTest{

private static InitialContext initialContext;
	
	@BeforeClass
    public static void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	
	@Test
	public void nameInjection() throws NamingException
	{
		GreetingManager greetingManager = (GreetingManager)initialContext.lookup("greetingManager");
		assertNotNull(greetingManager.getGreetingService());
		
	}
}
