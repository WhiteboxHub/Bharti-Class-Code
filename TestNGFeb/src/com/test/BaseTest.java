package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("in bfore suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("in before test");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("in after test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("in bfore suite");
	}
	
}
