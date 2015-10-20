package com.main;

public class Factorial {
	
	
	public int calculateFact(int num)
	{
		int fact = num;
		for(int i=num-1;i>1;i--)
		{
			fact = fact*i;
		}
		
		return fact;
	}
	
	public int recur(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num*recur(num-1);
		}
	}
	
	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		int val = fact.calculateFact(6);
		System.out.println("The factorial of number is" + val);
	}

}
