package com.wbqa;

import java.util.Arrays;

public class TestArray {
	
	public  void testFunction(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Array elements are" +  arr[i]);
		}
	}
	
	
	//largest in array
	public static void largest(int[] arr)
	{
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("largest value in array is " + max);
		
	}
	
	public static void reverse(int[] arr)
	{
		
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
		for(int i =0 ;i<arr.length;i++)
		{
			System.out.println("reversed array is " + arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
	/*	int[] a = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 5;
		a[4] = 6;
		
		for(int i =0;i<a.length;i++)
		{
			System.out.println("Array elements are" +  a[i]);
		}
		
		int[] b = {1,4,5,6,87};//declared,intstanitiation adn initialization
		for(int i =0;i<b.length;i++)
		{
			System.out.println("Array elements are" +  b[i]);
		}
		*/
		
		
		int[] arr = {12,20,10,56,78};
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("before Array elements are" +  arr[i]);
		}
		
		Arrays.sort(arr);
		//Arrays.
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("after Array elements are" +  arr[i]);
		}
		//TestArray test = new TestArray();
		//test.testFunction(arr);
		
		
		//maximum/largest number in array
		//largest(arr);
		
		
		//reverse an array
		//reverse(arr);
		
		/*int[][] a = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 1;
		a[1][0] = 1;
		a[1][1] = 1;
		a[1][2] = 1;
		a[2][0] = 1;
		a[2][1] = 1;
		a[2][2] = 1;
		
		
		for(int i = 0; i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("2 dimensional array is " + a[i][j]);
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
