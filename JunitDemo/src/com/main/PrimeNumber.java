package com.main;

public class PrimeNumber {

	//given input number is prime or not
	public boolean findPrimeNumber(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
