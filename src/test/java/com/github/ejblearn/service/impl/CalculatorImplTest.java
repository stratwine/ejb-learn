package com.github.ejblearn.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ejblearn.service.Calculator;

public class CalculatorImplTest {

	private static InitialContext initialContext;
	
	@BeforeClass
    public static void setUp() throws Exception {
        Properties properties = new Properties();
        properties.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");

        initialContext = new InitialContext(properties);
    }
	@Test
	public void lookupLocalBean() throws Exception
	{
		Calculator calculator = (Calculator)initialContext.lookup("/CalculatorImplLocal");
		assertTrue(calculator!=null);
	}
	
	@Test
	public void lookupRemoteBean() throws Exception
	{
		Calculator calculator = (Calculator)initialContext.lookup("/CalculatorImplRemote");
		assertTrue(calculator!=null);
	}
	
	@Test
	public void testAdd() throws Exception
	{
		Calculator calculator = (Calculator)initialContext.lookup("/CalculatorImplLocal");
		assertTrue(calculator.add(5, 3)==8);
	}
	
	
}
