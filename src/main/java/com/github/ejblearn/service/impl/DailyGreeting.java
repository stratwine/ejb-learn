package com.github.ejblearn.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.github.ejblearn.service.GreetingService;

@Remote(GreetingService.class)
@Stateless(name="dailyGreetingBean")
public class DailyGreeting implements GreetingService{

}
