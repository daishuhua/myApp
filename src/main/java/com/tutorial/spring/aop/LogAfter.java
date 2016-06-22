package com.tutorial.spring.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfter implements AfterReturningAdvice {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		logger.log(Level.INFO, args[0] + " 审核数据完成......");
	}

}
