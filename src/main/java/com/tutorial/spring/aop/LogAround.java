package com.tutorial.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogAround implements MethodInterceptor {
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		logger.log(Level.INFO, mi.getArguments()[0] + " 开始审核数据......");
		
		try {
//			Object result = mi.proceed();
//			return result;
			return null;
		} finally {
			logger.log(Level.INFO, mi.getArguments()[0] + " 审核数据结束......");
		}
	}
}
