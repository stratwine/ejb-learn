package com.github.ejblearn.service.impl;

import javax.ejb.Stateless;

import com.github.ejblearn.service.Calculator;


@Stateless(mappedName="calc")
public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}



}
