package com.tutorial.spring.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.log(Level.INFO, args[0] + " 开始审计数据......");
	}

}
