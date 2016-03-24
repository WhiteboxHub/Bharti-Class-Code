package com.test;

import static org.testng.Assert.*;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.StringOp;

public class StringOpSmokeTest extends BaseTest{
	
	
	@Test
	public void method1()
	{
		System.out.println("in string op smoke test");
		StringOp op  = new StringOp();
		int actual = op.countVowels("aa");
		int expected = 2;
		assertEquals(actual, expected);
	}
	
	
}
