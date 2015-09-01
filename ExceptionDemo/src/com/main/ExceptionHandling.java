package com.main;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

	//it will check if the passed age is correct or not
	public static void checkAge(int age) throws InvalidAge
	{
		if(age < 18)
		{
			throw new InvalidAge("Age is not valid");
			//System.out.println("Not a valid age");
		}
		else
		{
			System.out.println("Age is correct");
		}
	}
	
	public static void passAge()throws InvalidAge
	{
		//ask user to enter the age
		int age = 16;
		checkAge(age);
	}
	
	public static void main(String[] args) {
		
		try{
		ExceptionHandling.passAge();
			}
		catch(InvalidAge e)
		{
			System.out.println("hello exception occurred");
		}
	
		
		/*// TODO Auto-generated method stub
		try{
		int a = 50;
		int c = 50/10;
		System.out.println("value of c is = " + c);
			try{
				String s = "hi";
				
				System.out.println("converting to string again" + s.toString());
				}
				catch (NullPointerException e) {
					System.out.println("null pointer occured");
					e.printStackTrace();
				}
			}
		catch (NullPointerException e) {
			System.out.println("null pointer occured");
			e.printStackTrace();
		}

	*/	System.out.println("exception handled");
	}

}
