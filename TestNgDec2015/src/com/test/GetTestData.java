package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class GetTestData {

	@BeforeSuite
	public void get()
	{
		System.out.println("in before suite");
	}
	@BeforeTest
	public void getString()
	{
		System.out.println("in before test");
	}
	
	@AfterTest
	public void clearString()
	{
		System.out.println("in after test");
	}
	@AfterSuite
	public void clear()
	{
		System.out.println("in after suite");
	}
}
