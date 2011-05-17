package com.github.ejblearn.service;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
@Local
public interface Calculator {

	public int add(int a,int b);
}
