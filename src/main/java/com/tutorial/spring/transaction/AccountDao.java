package com.tutorial.spring.transaction;

public interface AccountDao {
	
	void outMoeny(String out, Double money);
	void inMoney(String in, Double money);

}
