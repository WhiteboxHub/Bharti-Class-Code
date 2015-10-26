package com.main;

public class CITIBank extends Bank{
	
	CITIBank()
	{
		super();
		//this()
		System.out.println(super.name);
		super.getRateOfInterest();
		System.out.println("child constructor");
		
	}
	public int getRateOfInterest()
	{
		return 8;
	}
}
