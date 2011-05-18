package com.github.ejblearn.service.impl;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;

public class BirthdayGreetingTest {

	private static InitialContext initialContext;
	
	@BeforeClass
    public static void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	
	@Test
	public void mappedNameCannotBeUsedWithLocalLookup() throws NamingException
	{
		initialContext.lookup("birthdayGreetingBean");
	}
}
