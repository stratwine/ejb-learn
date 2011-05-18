package com.github.ejblearn.service.impl;

import static org.junit.Assert.*;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ejblearn.service.GreetingService;

public class DailyGreetingTest {

	private static InitialContext initialContext;
	
	@BeforeClass
    public static void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	
	@Test
	public void lookupBasedOnMappedName() throws Exception
	{
		GreetingService dailyGreeting = (GreetingService) initialContext.lookup("dailyGreetingBeanLocal");
		assertTrue(dailyGreeting!=null);
	}
}
