package com.tutorial.spring.transaction4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	/**
	 * @param accountDao the accountDao to set
	 */
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoeny(out, money);
		int a = 1/0;
		accountDao.inMoney(in, money);
	}
}
