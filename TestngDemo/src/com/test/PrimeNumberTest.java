package com.test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Arrays;
import java.util.Collection;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.PrimeNumber;


public class PrimeNumberTest {


	@DataProvider(name="test1")
	public static Object[][] getData()
	{
		return new Object[][]{{2,true},{6,false}};
	}
	
	@Test(dataProvider="test1")
	public void testMethod1(int number , boolean expected)
	{
		PrimeNumber pn = new PrimeNumber();
		boolean actual = pn.findPrimeNumber(number);
		assertEquals(expected, actual);
	}
}
