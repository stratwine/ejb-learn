package com.github.ejblearn.service.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.github.ejblearn.service.GreetingService;

@Local(GreetingService.class)
@Stateless(name="wg")
public class WeddingGreeting {

}
