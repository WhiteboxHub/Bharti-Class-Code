package com.test;

import static org.testng.Assert.*;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.StringOp;

public class StringOpTest extends BaseTest{
	
	String str = null;
	int expected;
	StringOp op = null;
	
	@BeforeClass
	public void createObj()
	{
		System.out.println("in before class");
		 op = new StringOp();
	}
	
	@BeforeMethod
	public void set()
	{
		System.out.println("in before method");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		expected = sc.nextInt();
		
		
	}
	
	@Test
	public void method1()
	{
		
		int actual = op.countVowels(str);
		//int expected = 2;
		assertEquals(actual, expected);
	}
	
	@Test
	public void method2()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels(str);
		//int expected = 4;
		assertEquals(actual, expected);
	}
	@Test(enabled=false)
	public void method3()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels(str);
		//int expected = 0;
		assertEquals(actual, expected);
	}

	@Test(enabled=false)
	public void method4()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels(str);
		int expected = 1;
		assertEquals(actual, expected);
	}
	
	@Test(enabled=false)
	public void method5()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels("@#$5oo");
		int expected = 2;
		assertEquals(actual, expected);
	}
	
	@Test(enabled=false)
	public void method6()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels("ABilOO");
		int expected = 4;
		assertEquals(actual, expected);
	}
	
	@Test(enabled=false)
	public void method7()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels("");
		int expected = 0;
		assertEquals(actual, expected);
	}
	@Test(enabled=false,expectedExceptions=NullPointerException.class)
	public void method8()
	{
		StringOp op = new StringOp();
		int actual = op.countVowels(null);
		//int expected = 1;
		//assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void clear()
	{
		System.out.println("in after method");
		str = null;
		expected = 0;
	}
	
	@AfterClass
	public void clearObj()
	{
		System.out.println("in after class");
		op = null;
	}
}
