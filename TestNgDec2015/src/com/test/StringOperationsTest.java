package com.test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.StringOperations;

public class StringOperationsTest extends GetTestData {

	String str;
	int expected;
	Scanner sc;
	StringOperations op;
	
	@BeforeClass
	public void createObj()
	{
		System.out.println("in before class");
		 op = new StringOperations();
	}
	
	/*@BeforeMethod
	public void getString()
	{
		System.out.println("Please enter the string");
		sc = new Scanner(System.in);
		
		str = sc.next();
		System.out.println("Please enter the expected");
		expected = sc.nextInt();
	}
	*/
	@Test(enabled=false)
	public void method1()
	{
		System.out.println("in method1");
		//String str = "hello testng";
		//StringOperations op = new StringOperations();
		//int expected = 3;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	
	@Test(alwaysRun=true,dependsOnMethods={"method1"})
	public void method2()
	{
		System.out.println("in method2");
		//String str = "hello$%^&^&testng";
	//	StringOperations op = new StringOperations();
		//int expected = 3;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	@Test(priority=1)
	public void method3()
	{
		System.out.println("in method3");
		//String str = "hello12123421testng";
		StringOperations op = new StringOperations();
		int expected = 3;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	@Test(enabled=false)
	public void method4()
	{
		//String str = "ncldng nmbrs";
		StringOperations op = new StringOperations();
		int expected = 0;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	@Test(enabled=false)
	public void method5()
	{
		//String str = " ";
		StringOperations op = new StringOperations();
		int expected = 0;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	@Test(enabled=false)
	public void method6()
	{
		//String str = "Anitha GAbha";
		StringOperations op = new StringOperations();
		int expected = 5;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
	
	@AfterMethod
	public void clearString()
	{
		System.out.println("in after method");
		str = null;
		
		
	}
	
	@AfterClass
	public void clearObj()
	{
		System.out.println("in after class");
		 op = null;
		 sc.close();
	}
	
}
