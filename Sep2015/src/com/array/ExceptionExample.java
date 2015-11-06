package com.array;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionExample {

	public static void main(String[] args) {
		int a = 50;
		
		a = a/0;
		
		System.out.println("before");
		try{
			try{
		  int b = a/0;
			}
			catch(ArithmeticException e)
			{
				
			}
		  String s = null;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("hii exception ocured" );
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("hii exception ocured" );
		}
		catch (Exception e) {
			System.out.println("");
		}
		finally
		{
			System.out.println("exit");
		}
		
		
		System.out.println(a);
		try{
		  FileReader io = new FileReader("");
		}
		catch(FileNotFoundException e)
		{
			
		}
	}
}
