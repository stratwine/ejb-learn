package com.github.ejblearn.service.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.github.ejblearn.service.GreetingManager;
import com.github.ejblearn.service.GreetingService;

@Remote(GreetingManager.class)
@Stateless(mappedName="greetingManager")
public class GreetingManagerImpl implements GreetingManager{

	@EJB(beanName="dailyGreetingBean")
	GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
