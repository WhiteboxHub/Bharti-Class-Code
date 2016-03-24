package com.test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Collection;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.StringSort;

public class StringSortTest {

	
	@DataProvider(name="data")
	public static Object[][] getData()
	{
		Object[][] arr = {{"bharti","abhirt"},{"geeta","aeegt"}};
		return arr;
	}
	
	
	@Test(dataProvider="data")
	public void method2(String input,String expected)
	{
		StringSort sr = new StringSort();
		String actual = sr.sort(input);
		
		assertEquals(expected,actual);
	}
	
	@Test(enabled=false)
	@Parameters({"stringInput"})
	public void method1(String stringInput)
	{
		StringSort sr = new StringSort();
		String actual = sr.sort(stringInput);
		
		assertEquals("abhirt",actual);
	}
}
