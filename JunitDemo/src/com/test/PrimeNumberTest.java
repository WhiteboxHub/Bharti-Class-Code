package com.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.main.PrimeNumber;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

	int number;
	boolean expected;
	
	public PrimeNumberTest(int num , boolean ex)
	{
		this.number = num;
		this.expected = ex;
	}

	@Parameterized.Parameters
	public static Collection getData()
	{
		return Arrays.asList(new Object[][]{{2,true},{6,false}});
	}
	
	@Test
	public void testMethod1()
	{
		PrimeNumber pn = new PrimeNumber();
		boolean actual = pn.findPrimeNumber(number);
		assertEquals(expected, actual);
	}
}
