package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.LargestNumber;

public class LargestNumberTest{

	
	@Test
	public void getPositiveNumber()
	{
		LargestNumber ln = new  LargestNumber();
		int[] arr = {45,67,89,12,13,0};
		int max = ln.findMax(arr);
		assertEquals(89,max);
	}
	
	@Test
	public void getNegative()
	{
		LargestNumber ln = new  LargestNumber();
		int[] arr = {-12,-19,-1,-189};
		int max = ln.findMax(arr);
		assertEquals(-1,max);
	}
	
	@Test
	public void getMixNumber()
	{
		LargestNumber ln = new  LargestNumber();
		int[] arr = {-12,-19,-1,-189,0,45};
		int max = ln.findMax(arr);
		assertEquals(45,max);
	}
	
	@Test
	public void getDefault()
	{
		LargestNumber ln = new  LargestNumber();
		int[] arr = {Integer.MAX_VALUE,Integer.MIN_VALUE,98};
		int max = ln.findMax(arr);
		assertEquals(Integer.MAX_VALUE,max);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void getNull()
	{
		LargestNumber ln = new  LargestNumber();
		int[] arr = {};
		int max = ln.findMax(arr);
		assertEquals(0,max);
	}
}
