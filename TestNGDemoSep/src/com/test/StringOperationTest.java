package com.test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.StringOpeartion;

public class StringOperationTest {

	StringOpeartion so;
	String str;
	
	@BeforeClass
	public void initialize()
	{
		System.out.println("in before clas : StringOperationTest");
		so = new StringOpeartion();
	}
	
	@BeforeMethod
	public void setObject()
	{
		System.out.println("in before method");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
	}
	@Test
	public void checkVowels()
	{
		System.out.println(" in checkVowels2");
		int actual = so.countVowels(str);
		assertEquals(4,actual);
	}
	
	@Test(alwaysRun=true,dependsOnMethods={"checkVowels"})
	public void checkVowels1()
	{
		System.out.println(" in checkVowels1");
		int actual = so.countVowels(str);
		assertEquals(0,actual);
	}
	
	/*@Test
	public void checkVowels2()
	{
		
		int actual = so.countVowels("krshwlll");
		assertEquals(0,actual);
	}
	
	@Test
	public void checkVowels3()
	{
		
		int actual = so.countVowels("krshwlll344545aaa");
		assertEquals(3,actual);
	}
	
	@Test
	public void checkVowels4()
	{
		
		int actual = so.countVowels("krshwlll344545$$%&&&aaa");
		assertEquals(3,actual);
	}*/
	
	@Test
	public void checkVowels5()
	{
		
		int actual = so.countVowels("ADGTREBCGFTIO");
		assertEquals(4,actual);
	}
	
	@Test(enabled=false,expectedExceptions=NullPointerException.class)
	public void checkVowels6()
	{
		
		int actual = so.countVowels(null);
		assertEquals(4,actual);
	}
	
	@AfterMethod
	public void clearObj()
	{
		System.out.println("in after method");
		str = null;
	}
	
	@AfterClass
	public void clear()
	{
		System.out.println("in after clas : StringOperationTest");
		so = null;
	}
}
