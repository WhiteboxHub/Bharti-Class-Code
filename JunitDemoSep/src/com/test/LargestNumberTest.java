package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main.LargestNumber;

public class LargestNumberTest{

	LargestNumber ln;
	static long startTime;
	static long endTime;
	
	@BeforeClass
	public static void startTime()
	{
		System.out.println("in before clASS");
		startTime = System.currentTimeMillis();
	}
	
	@Before
	public void initialize()
	{
		System.out.println("in before");
		 ln = new  LargestNumber();
	}
	
	@Ignore
	@Test
	public void getPositiveNumber()
	{
		System.out.println("in getPositiveNumber");
		int[] arr = {45,67,89,12,13,0};
		int max = ln.findMax(arr);
		assertEquals(89,max);
	}
	
	@Test(timeout=10)
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
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void getNull()
	{
		System.out.println("in getNull");
		int[] arr = {};
		int max = ln.findMax(arr);
		assertEquals(0,max);
	}
	
	@After
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
}
