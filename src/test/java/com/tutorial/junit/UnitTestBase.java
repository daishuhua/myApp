package com.tutorial.junit;

import java.util.Locale;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

	private static ClassPathXmlApplicationContext context = null;
	
	private static String contextXmlPath;
	
	public UnitTestBase() {}
	
	public UnitTestBase(String contextXmlPath) {
		UnitTestBase.contextXmlPath = contextXmlPath;
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		if (StringUtils.isEmpty(contextXmlPath)) {
			contextXmlPath = "ApplicationContext.xml";
		}
		context = new ClassPathXmlApplicationContext(contextXmlPath);
		context.start();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Object> T getBean(String beanId) {
		return (T)context.getBean(beanId);
	}
	
	public <T extends Object> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}
 	
	public String getMessage(String code, Object args[], Locale locale) {
		return context.getMessage(code, args, locale);
	}

}
