package com.github.ejblearn.service.impl;

import javax.annotation.Resource;
import javax.ejb.Stateless;

import com.github.ejblearn.service.GreetingManager;
import com.github.ejblearn.service.GreetingService;

@Stateless
public class GreetingManagerImpl implements GreetingManager{

	@Resource(name="birthdayGreetingBean")
	GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
