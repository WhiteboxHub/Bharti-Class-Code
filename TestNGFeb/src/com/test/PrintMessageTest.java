package com.test;

import static org.testng.Assert.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.main.PrintMessage;

public class PrintMessageTest extends BaseTest {

	
	/*
	@Test(enabled=false)
	@Parameters("myStr")
	public void method1(String name)
	{
		System.out.println("in method1");
		String expected = "Hi "+name;
		
		PrintMessage pm = new PrintMessage();
		String actual = pm.printHi(name);
		assertEquals(expected,actual);
	}
	@Test(alwaysRun=true,dependsOnMethods={"method1"})
	public void method3()
	{
		System.out.println("in method3");
		String expected = "Hi priya";
		
		PrintMessage pm = new PrintMessage();
		String actual = pm.printHi("priya");
		assertEquals(expected,actual);
	}*/
	
	@Test(invocationCount=10,threadPoolSize=3)
	public void method2()
	{
		System.out.println("start thread id" + Thread.currentThread().getId());
		assertTrue(true);
		System.out.println("end thread id" + Thread.currentThread().getId());
		/*String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = null;
		int x1 = 5;
		int x2  = 6;
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		
		
		assertEquals(str1,str2);
		assertNotEquals(str1,str5);
		assertNull(str5);
		assertNotNull(str1);
		assertTrue(x1 < x2);
		assertFalse(x1 > x2);
		assertSame(str1, str2);
		assertNotSame(str4, str3);
		assertEquals(a1, a2);*/
		
		
		
		

	}
	
	
}
