package com.tutorial.spring.di;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Locale;

import org.junit.Ignore;
import org.junit.Test;

import com.tutorial.junit.UnitTestBase;

public class HelloWorldTest extends UnitTestBase {
	
	public HelloWorldTest() {
		super("classpath:ApplicationContext.xml");
	}

	@Test
	public void test1() {
		HelloWorld helloWorld = getBean("HelloWorld");
		System.out.println(helloWorld.doSalutation());
		assert(true);
	}
	
	@Test(expected=FileNotFoundException.class, timeout=4000)
	@Ignore
	public void test2() throws FileNotFoundException, InterruptedException {
		Thread.sleep(3000);
		throw new FileNotFoundException();
	}
	@Test
	@Ignore
	public void test3() {
		
	}
	
	@Test
	public void test4() {
		Object[] objs = new Object[] {"HelloWorld", Calendar.getInstance().getTime()};
		String msg = getMessage("HelloWorld", objs, Locale.US);
		System.out.println(msg);
	}

}
