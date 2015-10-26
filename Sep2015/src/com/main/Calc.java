package com.main;

public class Calc {

	int firstNum = 10;
	
	Calc()
	{
		
	}
	public int sum()
	{
		int firstNum = 20;
		int secondNum = 30;
		System.out.println(firstNum);
		int sum = firstNum + secondNum;
		return sum;
	}
	

	public double sum(int a ,int b,int c)
	{
		return a+b+c;
	}
	
	public double sum(int a ,double b)
	{
		return a+b;
	}
	public static void main(int i) {
		 System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.get
		Calc obj = new Calc();
		double sum1 = obj.sum();
		double sum2 = obj.sum(3,54);
		double sum3 = obj.sum(3,4,6);
		double sum4 = obj.sum(3,8.9);
		
		System.out.println("sum is " + sum1 +" "+ sum2 +" "+ sum3+" " + sum4);
		main(5);
	}
}
