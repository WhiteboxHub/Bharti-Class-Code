package com.advanced;

public class EnumExample {
	public enum Days{
		Sunday,
		Monday,
		Tuesday
		
	}
	
	public static void main(String[] args) {
		
		for(Days d : Days.values())
		{
			System.out.println(d);
		}
		
		
		
		Days day = Days.Monday;
		System.out.println(day);
		
		switch(day)
		{
		case Sunday:
			System.out.println("day is sunday");
			break;
		case Monday:
			System.out.println("day is Monday");
			break;
		case Tuesday:
			System.out.println("day is Tuesday");
			break;
		}
	}
}
