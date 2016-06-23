package com.tutorial.spring.transaction4;

public interface AccountDao {
	
	void outMoeny(String out, Double money);
	void inMoney(String in, Double money);

}
