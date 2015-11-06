package com.advanced;

import java.io.FileReader;
import java.io.IOException;

public class ThrowExample {

	
	public static void checkAge(int age)//throws FileNotFoundException
	{
		if(age < 18)
		{
			//throw new InvalidAgeException("invalid");
		}
		else
		{
			System.out.println("hello");
		}
	}
	
	static void check(int age)throws InvalidAgeException
	{
		checkAge(age);
	}
	
	
	public static void main(String[] args) {
		try{
		ThrowExample.check(17);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("error came");
		}
		
	}
}
