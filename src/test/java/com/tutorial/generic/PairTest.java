package com.tutorial.generic;

import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JSlider;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PairTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		
		if (mm instanceof Pair) {
			
		}
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
	}
	
	@Test
	public void test() {
		Dictionary<Integer, Component> labelTable = new Hashtable<>();
		
		System.out.println(labelTable.getClass());
		
	}
}
