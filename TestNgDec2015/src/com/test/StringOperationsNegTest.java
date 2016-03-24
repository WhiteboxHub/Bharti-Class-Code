package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.main.StringOperations;

public class StringOperationsNegTest extends GetTestData {

	@Test(expectedExceptions=NullPointerException.class)
	public void method7()
	{
		String str = null;
		StringOperations op = new StringOperations();
		int expected = 0;
		int actual = op.countVowels(str);
		
		assertEquals(expected,actual);
	}
}
