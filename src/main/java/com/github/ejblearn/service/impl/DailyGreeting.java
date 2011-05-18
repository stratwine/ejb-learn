package com.github.ejblearn.service.impl;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;

import com.github.ejblearn.service.GreetingService;

@Local(GreetingService.class)
@Remote(GreetingService.class)
@Stateful(mappedName="dGreeting")
public class DailyGreeting implements GreetingService{

}
