package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.PrintMessage;

public class PrintMessageTest {

	@Test
	public void method1()
	{
		String expected = "Hi priya";
		
		PrintMessage pm = new PrintMessage();
		String actual = pm.printHi("priya");
		assertEquals(expected,actual);
	}
	
	@Test
	public void method2()
	{
		String str1 = "abc";
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
		assertArrayEquals(a1, a2);

		
		
		

	}
	
	
}
