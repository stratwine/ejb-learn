package com.github.ejblearn.service.impl;

import javax.ejb.Stateless;

import com.github.ejblearn.service.Calculator;


@Stateless
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}



}
