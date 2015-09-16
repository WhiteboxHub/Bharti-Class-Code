package com.test;

import static org.testng.AssertJUnit.assertNull;
import static org.testng.AssertJUnit.assertEquals;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.main.Example;

public class ExampleTest {
	String str;
	//Scanner sc = null;
	
/*	@BeforeClass
	public void init()
	{
		  System.out.println("inside before class");
		 sc = new Scanner(System.in);
	}
	@BeforeMethod
	 public void getString()
	 {
		System.out.println("inside before method");
		 System.out.println("Please enter the string");
		 str = sc.next();
	 }*/
  @Test
  public void testMethod1() {
	  Example ex = new Example();
	   str = "hello";
	  String actual = ex.sortString(str);
	  String expected = "ehllo";
	  SoftAssert sa = new SoftAssert();
	  sa.assertNull(str);
	  System.out.println("hii");
	  sa.assertEquals(expected,actual);
	  
  }
  
  @Test(enabled=false)
  public void testMethod2() {
	  Example ex = new Example();
	  str = "HEllo";
	  String actual = ex.sortString(str);
	  String expected = "EHllo";
	  assertEquals(expected,actual);
  }
  
  @Test(enabled=false)
  public void testMethod3() {
	  Example ex = new Example();
	  str = "HEllo";
	  String actual = ex.sortString(str);
	  String expected = "EHllo";
	  assertEquals(expected,actual);
  }
  /*@AfterMethod
  public void clearString()
  {
	  System.out.println("inside after method");
	  str = null;
  }
  
  @AfterClass
  public void exit()
  {
	  System.out.println("inside after class");
	  sc.close();
  }*/
}
