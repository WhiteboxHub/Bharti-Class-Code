package com.main;

public class PrimeNumbers {

	public boolean checkPrime(int number)
	{
		boolean isPrime = true;
		
		for(int i=2;i<(number/2);i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		return isPrime;
	}
}
