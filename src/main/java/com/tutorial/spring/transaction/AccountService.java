package com.tutorial.spring.transaction;

public interface AccountService {

	void transfer(String out, String in, Double money);
	
}
