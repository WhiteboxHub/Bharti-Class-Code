package com.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main.LargestNumber;


public class LargestNumberTest {
	
	int expected = 0;
	Scanner sc = null;
	static LargestNumber ln = null;
	
	@BeforeClass
	public static void setupObj()
	{
		System.out.println("in before class");
		ln = new LargestNumber();
	}
	
	@Before
	public void getInput()
	{
		System.out.println("in before");
		sc = new Scanner(System.in);
		expected = sc.nextInt();
	}
	
	@Test(timeout=100)
	public void method1()
	{
        int[] arr = {10,25,2,65,26};
       // int expected  = 65;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void method2()
	{
        int[] arr = {-10,-25,-2,-65,-26};
      //  int expected  = -2;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Test
	public void method3()
	{
        int[] arr = {10,25,25,65,26};
      //  int expected  = 65;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@After
	public void clearInput()
	{
		System.out.println("in after");
		sc = null;
		expected = 0;
	}
	
	@AfterClass
	public static void clearObj()
	{
		System.out.println("in after class");
		ln = null;
	}
	
	@Ignore
	@Test
	public void method4()
	{
        int[] arr = {90,25,25,65,26};
        int expected  = 90;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Ignore
	@Test
	public void method5()
	{
        int[] arr = {90,-25,0,65,-2};
        int expected  = 90;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Ignore
	@Test
	public void method6()
	{
        int[] arr = {90};
        int expected  = 90;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
	}
	
	@Ignore
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void method7()
	{
        int[] arr = {};
       // int expected  = 90;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		//assertEquals(expected,actual);
	}
}
