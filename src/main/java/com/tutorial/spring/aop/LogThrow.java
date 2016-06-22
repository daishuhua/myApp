package com.tutorial.spring.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class LogThrow implements ThrowsAdvice {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		logger.log(Level.INFO, args[0] + " 审核数据有异常抛出......");
	}

}
