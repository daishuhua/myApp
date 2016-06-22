package com.tutorial.spring.aop;

import java.net.URL;

import org.junit.Ignore;
import org.junit.Test;

import com.tutorial.junit.UnitTestBase;
import com.tutorial.spring.aop.impl.Logic2;
import com.tutorial.spring.aop.impl.TimeBook;

import sun.misc.Launcher;

public class LogProxyTest extends UnitTestBase {
	
	public LogProxyTest() {
		super("classpath:ApplicationContext.xml");
	}
	
	@Test
	@Ignore
	public void test1() {
		LogProxy logProxy = new LogProxy();
		TimeBookInterface timeBookProxy = (TimeBookInterface)logProxy.bind(new TimeBook());
		timeBookProxy.doAuditing("张三");
	}
	
	@Test
	@Ignore
	public void test2() {
		TimeBookInterface timeBookProxy = getBean("logProxy");
		timeBookProxy.doAuditing("张三");
	}
	
	@Test
	@Ignore
	public void test3() {
		TimeBookInterface timeBookProxy = getBean("logProxy2");
		timeBookProxy.doAuditing("张三");
		
	}
	
	@Test
	@Ignore
	public void test4() {
		TimeBookInterface timeBookProxy = getBean("logProxy3");
		timeBookProxy.doAuditing("张三");
	}
	
	@Test
	@Ignore
	public void test5() {
		TimeBookInterface timeBookProxy = getBean("logProxy4");
		timeBookProxy.doAuditing("张三");
	}
	
	@Test
	@Ignore
	public void test6() {
		TimeBookInterface timeBookProxy = getBean("timeBook");
		timeBookProxy.doCheck("张三");
		timeBookProxy.doAuditing("李四");
	}
	
	@Test
	public void test7() {
		Logic2 logic = getBean("logic2");
		try {
			logic.doInsert("张三");
			logic.doUpdate("李四");
			logic.doDelete("王五");
		} catch(Exception e) {
			
		}
	}

	@Test
	@Ignore
	public void test() {
		URL[] urls = Launcher.getBootstrapClassPath().getURLs();
	    for (int i = 0; i < urls.length; i++) {
	      System.out.println(urls[i].toExternalForm());
	    }
	    
	    System.out.println(System.getProperty("java.ext.dirs").replace(":", "\n"));
	    ClassLoader extensionClassloader=ClassLoader.getSystemClassLoader().getParent();
	    System.err.println("the parent of extension classloader : "+extensionClassloader.getParent());
	    System.out.println(System.getProperty("java.class.path").replace(":", "\n"));
	}

}
