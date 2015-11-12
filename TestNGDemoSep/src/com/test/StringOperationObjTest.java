package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.main.StringOpeartion;

public class StringOperationObjTest {

	@BeforeSuite
	public void beforeSuiteEx()
	{
		System.out.println(" in before suite");
	}
	@BeforeTest
	public void beforeTestEx()
	{
		System.out.println("in before string test");
	}
	
	@BeforeClass
	public void beforeClassEx()
	{
		System.out.println("in before class : StringOperationObjTest");
	}
	@Test
	public void testString()
	{
		StringOpeartion so = new StringOpeartion();
		assertEquals(6,so.countVowels("aaaiii"));
	}
	
	@AfterClass
	public void afterClassEx()
	{
		System.out.println("in after class : StringOperationObjTest");
	}
	@AfterTest
	public void afterTestEx()
	{
		System.out.println("in after string test");
	}
	@AfterSuite
	public void afterSuiteEx()
	{
		System.out.println(" in after suite");
	}
}
