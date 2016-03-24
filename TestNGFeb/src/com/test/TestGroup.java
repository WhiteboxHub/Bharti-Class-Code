package com.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeGroups;

//@Test(groups={"database","selenium-test"})
public class TestGroup{
	
	/*@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}*/
	
	@Test(groups= "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	@Test(groups= "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}
	
	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
		assertTrue(false);
	}

	@Test(groups = "database")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}
	
	@Test(dependsOnGroups={"database"})
	public void testFunc()
	{
		System.out.println("both");
	}
	
}
