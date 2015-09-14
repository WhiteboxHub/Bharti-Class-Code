package com.main;

public class Example {

	//find the largest in a given array elements
	public int getLargest(int[] arr)
	{
		int num = arr[0];
		for(int i =1;i<arr.length;i++)
		{
			if(num < arr[i])
			{
				num = arr[i];
			}
		}
		return num;
	}
	
	
	/*public static void main(String[] args) {
		Example ex = new Example();
		int[] arr = {2,1,4,5,7,8,};
		System.out.println("The largest number is : " + ex.getLargest(arr));
		
	}*/
}
