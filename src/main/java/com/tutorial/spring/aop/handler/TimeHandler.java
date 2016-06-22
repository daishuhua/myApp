package com.tutorial.spring.aop.handler;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TimeHandler implements MethodInterceptor {
	
	private Logger logger = Logger.getLogger(this.getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long procTime = System.currentTimeMillis();
		logger.log(Level.INFO, invocation.getArguments()[0] + " 开始执行 " + invocation.getMethod() + "方法");
		try {
			Object result = invocation.proceed();
			return result;
		} finally {
			procTime = System.currentTimeMillis() - procTime;
			logger.log(Level.INFO, invocation.getArguments()[0] + " 执行 " + invocation.getMethod() + " 方法执行结束");
			logger.log(Level.INFO, "执行" + invocation.getMethod().getName() + " 方法共用了 " + procTime + "毫秒");
		}
	}
}
