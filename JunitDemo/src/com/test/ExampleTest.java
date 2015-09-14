package com.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main.Example;


public class ExampleTest  {

	Example ex ;
	int[] arr;
	int expected = 0;
	static Scanner sc = null;
	
	@BeforeClass
	public static void start()
	{
		sc = new Scanner(System.in);
	}

	
	@Before
	public void initialize()
	{
		 //System.out.println(" inside before");
		 ex = new Example();
		 System.out.println("Please enter the size of array");
		 int size = sc.nextInt();
		 arr = new int[size];
		 int count = 0;
		 while(count < size)
		 {
			 System.out.println("please enter the array elements");
			 arr[count] = sc.nextInt();
			 count++;
		 }
		 System.out.println("Please enter the expected largest number");
		 expected = sc.nextInt();
	}
	
	@Test
	public void testMethod1()
	{
		
		//int[] arr = {2,1,4,5,7,8,};
		int actual = ex.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Test
	@Ignore
	public void testMethod2()
	{
		//int[] arr = {-2,-1,-4,-5,-7,-8,};
		int actual = ex.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Test
	@Ignore
	public void testMethod3()
	{
		//int[] arr = {-2,-1,4,-5,7,-8,-100,-10};
		int actual = ex.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Test(expected = NullPointerException.class)
	@Ignore
	public void testMethod4()
	{
		//int[] arr = null;
		int actual = ex.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@After
	public void clear()
	{
		//System.out.println("In after");
		ex = null;
		arr = null;
	}
	
	@AfterClass
	public static void end()
	{
		sc.close();
	}
}
