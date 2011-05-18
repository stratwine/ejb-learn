package com.github.ejblearn.service.impl;

import java.util.Properties;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.ejblearn.service.GreetingService;

@Local(GreetingService.class)
@Stateless(name="birthdayGreetingBean")
public class BirthdayGreeting implements GreetingService {
	
	

}
