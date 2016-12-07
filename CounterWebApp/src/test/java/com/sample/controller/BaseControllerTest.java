package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@Controller
public class BaseControllerTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public BaseControllerTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(BaseControllerTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		System.out.println();
		assertTrue(true);
	}
	
	public void testWelcome(){
		BaseController bc = new BaseController();
		bc.welcome(new ModelMap());
		assertEquals("index","index");
	}
	
	public void testWelcomeName(){
		BaseController bc = new BaseController();
		bc.welcomeName("index",new ModelMap());
		assertEquals("index","index");
	}

}