package com.test;



import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.main.LargestNumber;

public class LargestNumberTest{

	LargestNumber ln;
	static long startTime;
	static long endTime;
	@BeforeTest
	public void beforeTestEx()
	{
		System.out.println("in before array test");
	}
	
	@BeforeClass
	public static void startTime()
	{
		System.out.println("in before clASS");
		startTime = System.currentTimeMillis();
	}
	
	@BeforeMethod
	public void initialize()
	{
		System.out.println("in before");
		 ln = new  LargestNumber();
	}
	
	@Test
	public void getPositiveNumber()
	{
		System.out.println("in getPositiveNumber");
		int[] arr = {45,67,89,12,13,0};
		int max = ln.findMax(arr);
		assertEquals(89,max);
	}
	
	/*@Test
	public void getNegative()
	{
		System.out.println("in getNegative");
		int[] arr = {-12,-19,-1,-189};
		int max = ln.findMax(arr);
		assertEquals(-1,max);
		while(true);
	}
	
	@Test
	public void getMixNumber()
	{
		System.out.println("in getMixNumber");
		int[] arr = {-12,-19,-1,-189,0,45};
		int max = ln.findMax(arr);
		assertEquals(45,max);
	}
	
	@Test
	public void getDefault()
	{
		System.out.println("in getDefault");
		int[] arr = {Integer.MAX_VALUE,Integer.MIN_VALUE,98};
		int max = ln.findMax(arr);
		assertEquals(Integer.MAX_VALUE,max);
	}*/
	
	/*@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void getNull()
	{
		System.out.println("in getNull");
		int[] arr = {};
		int max = ln.findMax(arr);
		assertEquals(0,max);
	}
	*/
	@AfterMethod
	public void clear()
	{
		ln = null;
		System.out.println("in after");
	}
	
	@AfterClass
	public static void endTime()
	{
		System.out.println("in after clASS");
		endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println("the time taken to execute the class is " + duration);
		
	}
	
	@AfterTest
	public void afterTestEx()
	{
		System.out.println("in after array test");
	}
}
